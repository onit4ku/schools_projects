<?php
class lineaDAO
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
	public function Listar($numFactura)
	{
		try
		{
			$result = array();

			$stm = $this->pdo->prepare("SELECT * FROM linea WHERE IDR_Factura = ?");
			$stm->execute(array($numFactura));			

			foreach($stm->fetchAll(PDO::FETCH_OBJ) as $r)
			{
				$lin = new lineaVO();

				$lin->setid( $r->ID_Linea);
				$lin->setCantidad( $r->Cantidad_Linea);
				$lin->setPrecio( $r->Precio_Linea);
				$lin->setFactura( $r->IDR_Factura);
				$lin->setProducto( $r->IDR_Producto);

				$result[] = $lin;
			}

			return $result;
		}
		catch(Exception $e)
		{
			die($e->getMessage());
		}
	}
	public function Eliminar($id)
	{
		try 
		{
			$stm = $this->pdo
			          ->prepare("DELETE FROM linea WHERE ID_Linea = ?");			          

			$stm->execute(array($id));
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Actualizar(lineaVO $lin)
	{
		try 
		{
			$sql = "UPDATE linea SET 
						Cantidad_Linea          = ?, 
						Precio_Linea        	= ?,
						IDR_Factura             = ?, 
						IDR_Producto 			= ?
				    WHERE ID_Linea 				= ?";

			$this->pdo->prepare($sql)
			     ->execute(
				array(
						$lin->getid(),
						$lin->getCantidad(),
						$lin->getPrecio(),
						$lin->getFactura(),
						$lin->getProducto()	
					)
				);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}

	public function Registrar(lineaVO $lin)
	{
		try 
		{
		$sql = "INSERT INTO linea (Cantidad_Linea,Precio_Linea,IDR_Factura,IDR_Producto) 
		        VALUES (?, ?, ?, ?)";

		$this->pdo->prepare($sql)
		     ->execute(
			array(
				$lin->getCantidad(),
				$lin->getPrecio(),
				$lin->getFactura(),
				$lin->getProducto()	
				)
			);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
}