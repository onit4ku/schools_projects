<?php
class Factura
{
	private $Num_Factura;
	private $Fecha_Factura;
	private $IDR_Cliente;

	public function __GET($k){ return $this->$k; }
	public function __SET($k, $v){ return $this->$k = $v; }
}