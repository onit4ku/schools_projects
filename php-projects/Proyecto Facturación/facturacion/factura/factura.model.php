<?php
class FacturaModel
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
			$stm = $this->pdo->prepare("SELECT * FROM factura");
			$stm->execute();

			foreach($stm->fetchAll(PDO::FETCH_OBJ) as $r)
			{
				$alm = new Factura();
				$alm->__SET('Num_Factura', $r->Num_Factura);
				$alm->__SET('Fecha_Factura', $r->Fecha_Factura);
				$alm->__SET('IDR_Cliente', $r->IDR_Cliente);

				$result[] = $alm;
			}
			return $result;
		}
		catch(Exception $e)
		{
			die($e->getMessage());
		}
	}
	public function Obtener($Num_Factura)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("SELECT * FROM factura WHERE Num_Factura = ?");
			$stm->execute(array($Num_Factura));
			$r = $stm->fetch(PDO::FETCH_OBJ);
			$alm = new Factura();
			$alm->__SET('Nombre_Factura', $r->Nombre_Factura);
			$alm->__SET('Num_Factura', $r->Num_Factura);
			$alm->__SET('Fecha_Factura', $r->Fecha_Factura);

			return $alm;
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
	public function Eliminar($Num_Factura)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("DELETE FROM factura WHERE Num_Factura = ?");			          

			$stm->execute(array($Num_Factura));
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Actualizar(Factura $data)
	{
		try 
		{
			$sql = "UPDATE factura SET 
						Num_Factura        = ?,
						Fecha_Factura            = ?
				    WHERE Num_Factura = ?";

			$this->pdo->prepare($sql)
			     ->execute(
				array(
					$data->__GET('Num_Factura'), 
					$data->__GET('Fecha_Factura'),
					)
				);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Registrar(Factura $data)
	{
		try 
		{
		$sql = "INSERT INTO factura (Num_Factura,Fecha_Factura) 
		        VALUES (?, ?)";

		$this->pdo->prepare($sql)
		     ->execute(
			array(
				$data->__GET('Num_Factura'), 
				$data->__GET('Fecha_Factura'),
				$data->__GET('IDR_Cliente')
				)
			);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
}