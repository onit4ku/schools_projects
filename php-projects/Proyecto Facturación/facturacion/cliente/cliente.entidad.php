<?php
class Cliente
{
	private $Nombre_Cliente;
	private $NIF_Cliente;
	private $Direccion_Cliente;

	public function __GET($k){ return $this->$k; }
	public function __SET($k, $v){ return $this->$k = $v; }
}