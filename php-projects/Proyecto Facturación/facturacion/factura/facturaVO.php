<?php
class facturaVO
{
	private $numFactura;
	private $fechaFactura;
	private $IDR_Cliente;	

	public function getNumFactura(){
		return $this->numFactura;
	}

	public function setNumFactura($lnum){
		$this->numFactura=$lnum;
	}

	public function getFechaFactura(){
		return $this->fechaFactura;
	}

	public function setFechaFactura($lfecha){
		$this->fechaFactura=$lfecha;
	}

	public function getCliente(){
		return $this->IDR_Cliente;
	}

	public function setCliente($lIDR_Cliente){
		$this->IDR_Cliente=$lIDR_Cliente;
	}


}