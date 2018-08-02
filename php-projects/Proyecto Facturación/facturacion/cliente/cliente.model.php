<?php
class ClienteModel
{
	private $pdo;

	public function __CONSTRUCT()
	{
		try
		{
			$this->pdo = new PDO('mysql:host=localhost;dbname=facturacion_ruben', 'root', '');
			$this->pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);		        
		}
		catch(Exception $e)
		{
			die($e->getMessage());
		}
	}

	public function Listar()
	{
		try
		{
			$result = array();

			$stm = $this->pdo->prepare("SELECT * FROM cliente");
			$stm->execute();

			foreach($stm->fetchAll(PDO::FETCH_OBJ) as $r)
			{
				$alm = new Cliente();
				$alm->__SET('Nombre_Cliente', $r->Nombre_Cliente);
				$alm->__SET('NIF_Cliente', $r->NIF_Cliente);
				$alm->__SET('Direccion_Cliente', $r->Direccion_Cliente);

				$result[] = $alm;
			}

			return $result;
		}
		catch(Exception $e)
		{
			die($e->getMessage());
		}
	}

	public function Obtener($NIF_Cliente)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("SELECT * FROM cliente WHERE NIF_Cliente = ?");
			          

			$stm->execute(array($NIF_Cliente));
			$r = $stm->fetch(PDO::FETCH_OBJ);

			$alm = new Cliente();
			$alm->__SET('Nombre_Cliente', $r->Nombre_Cliente);
			$alm->__SET('NIF_Cliente', $r->NIF_Cliente);
			$alm->__SET('Direccion_Cliente', $r->Direccion_Cliente);

			return $alm;
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Eliminar($NIF_Cliente)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("DELETE FROM cliente WHERE NIF_Cliente = ?");			          

			$stm->execute(array($NIF_Cliente));
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Actualizar(Cliente $data)
	{
		try 
		{
			$sql = "UPDATE cliente SET 
						Nombre_Cliente = ?, 
						Direccion_Cliente = ?
				    WHERE NIF_Cliente = ?";

			$this->pdo->prepare($sql)
			     ->execute(
				array(
					$data->__GET('Nombre_Cliente'), 
					$data->__GET('Direccion_Cliente'),
					$data->__GET('NIF_Cliente')
					)
				);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Registrar(Cliente $data)
	{
		try 
		{
		$sql = "INSERT INTO cliente (Nombre_Cliente,NIF_Cliente,Direccion_Cliente) 
		        VALUES (?, ?, ?)";

		$this->pdo->prepare($sql)
		     ->execute(
			array(
				$data->__GET('Nombre_Cliente'), 
				$data->__GET('NIF_Cliente'), 
				$data->__GET('Direccion_Cliente')
				)
			);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
}