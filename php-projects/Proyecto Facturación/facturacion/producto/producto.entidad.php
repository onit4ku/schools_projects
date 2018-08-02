<?php
class Producto
{
	private $ID_Producto;
	private $Nombre_Producto;
	private $Precio_Producto;

	public function __GET($k){ return $this->$k; }
	public function __SET($k, $v){ return $this->$k = $v; }
}