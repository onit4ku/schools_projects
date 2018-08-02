<?php
class ProductoModel
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

			$stm = $this->pdo->prepare("SELECT * FROM producto");
			$stm->execute();

			foreach($stm->fetchAll(PDO::FETCH_OBJ) as $r)
			{
				$alm = new Producto();
				$alm->__SET('Nombre_Producto', $r->Nombre_Producto);
				$alm->__SET('ID_Producto', $r->ID_Producto);
				$alm->__SET('Precio_Producto', $r->Precio_Producto);

				$result[] = $alm;
			}

			return $result;
		}
		catch(Exception $e)
		{
			die($e->getMessage());
		}
	}

	public function Obtener($ID_Producto)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("SELECT * FROM producto WHERE ID_Producto = ?");
			          

			$stm->execute(array($ID_Producto));
			$r = $stm->fetch(PDO::FETCH_OBJ);

			$alm = new Producto();
			$alm->__SET('Nombre_Producto', $r->Nombre_Producto);
			$alm->__SET('Precio_Producto', $r->Precio_Producto);
			$alm->__SET('ID_Producto', $r->ID_Producto);
			return $alm;
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Eliminar($ID_Producto)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("DELETE FROM producto WHERE ID_Producto = ?");			          

			$stm->execute(array($ID_Producto));
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Actualizar(Producto $data)
	{

		
		echo $data->__GET('ID_Producto');
		try 
		{
			$sql = "UPDATE producto SET 
						Nombre_Producto = ?, 
						Precio_Producto = ?
				    WHERE ID_Producto = ?";

			$this->pdo->prepare($sql)
			     ->execute(
				array(
					$data->__GET('Nombre_Producto'), 
					$data->__GET('Precio_Producto'),
					$data->__GET('ID_Producto')
					)
				);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Registrar(Producto $data)
	{
		try 
		{
		$sql = "INSERT INTO producto (Nombre_Producto,Precio_Producto) 
		        VALUES (?, ?)";

		$this->pdo->prepare($sql)
		     ->execute(
			array(
				$data->__GET('Nombre_Producto'), 
				$data->__GET('Precio_Producto')
				)
			);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
}