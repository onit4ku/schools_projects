<?php
class lineaVO
{
	private $id;
	private $cantidad;
	private $precio;
	private $IDR_factura;
	private $IDR_producto;	
	private $Nombre_Producto;	

	public function setid($lid){
		$this->id=$lid;
	}

	public function getid(){
		return $this->id;
	}
	
	//*******

	public function getCantidad(){
		return $this->cantidad;
	}

	public function setCantidad($lcantidad){
		$this->cantidad=$lcantidad;
	}

	//*******

	public function getPrecio(){
		return $this->precio;
	}

	public function setPrecio($lprecio){
		$this->precio=$lprecio;
	}

	//*******

	public function getFactura(){
		return $this->IDR_factura;
	}

	public function setFactura($lIDR_factura){
		$this->IDR_factura=$lIDR_factura;
	}

	//*******

	public function getProducto(){
		return $this->IDR_producto;
	}

	public function setProducto($lIDR_producto){
		$this->IDR_producto=$lIDR_producto;
	}

	public function getNombreProducto(){
		return $this->Nombre_Producto;
	}

	public function setNombreProducto($lnom_producto){
		$this->Nombre_Producto=$lnom_producto;
	}
}