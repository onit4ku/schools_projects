<?php
class facturaDAO
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
	
	public function Registrar(FacturaVO $data)
	{
		try 
		{
		$sql = "INSERT INTO factura (Num_Factura,Fecha_Factura,IDR_cliente) 
		        VALUES (?, ?, ?)";

		$this->pdo->prepare($sql)
		     ->execute(
			array(
				$data->getNumFactura(),
				$data->getFechaFactura(),
				$data->getCliente()
				)
			);
		} catch (Exception $e) 
		{
			die($e->getMessage());
		}
	}
}