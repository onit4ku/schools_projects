<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <head>
        <title>Albarán Generado</title>
        
       <style type="text/css">
        /*<![CDATA[*/
            <!--

            #logo {
                position:absolute;
                left:400px;
                top:30px;
                width:1.45in;
                height:0.792in;
                z-index:10;
                text-align:right;
            }
           
           /* estilos tablas*/

            .CSSTableGenerator {
                margin:0px;padding:0px;
                width:100%;
                box-shadow: 10px 10px 5px #888888;
                border:1px solid #000000;

                -moz-border-radius-bottomleft:0px;
                -webkit-border-bottom-left-radius:0px;
                border-bottom-left-radius:0px;

                -moz-border-radius-bottomright:0px;
                -webkit-border-bottom-right-radius:0px;
                border-bottom-right-radius:0px;

                -moz-border-radius-topright:0px;
                -webkit-border-top-right-radius:0px;
                border-top-right-radius:0px;

                -moz-border-radius-topleft:0px;
                -webkit-border-top-left-radius:0px;
                border-top-left-radius:0px;
            }.CSSTableGenerator table{
                border-collapse: collapse;
                    border-spacing: 0;
                width:100%;
                height:100%;
                margin:0px;padding:0px;
            }.CSSTableGenerator tr:last-child td:last-child {
                -moz-border-radius-bottomright:0px;
                -webkit-border-bottom-right-radius:0px;
                border-bottom-right-radius:0px;
            }

            .CSSTableGenerator tr{
                color: rgba(229, 92, 46, 0.98) ;
            }

            .CSSTableGenerator table tr:first-child td:first-child {
                -moz-border-radius-topleft:0px;
                -webkit-border-top-left-radius:0px;
                border-top-left-radius:0px;
            }
            .CSSTableGenerator table tr:first-child td:last-child {
                -moz-border-radius-topright:0px;
                -webkit-border-top-right-radius:0px;
                border-top-right-radius:0px;
            }.CSSTableGenerator tr:last-child td:first-child{
                -moz-border-radius-bottomleft:0px;
                -webkit-border-bottom-left-radius:0px;
                border-bottom-left-radius:0px;

                /*****************hover de la celda***************/
            }.CSSTableGenerator tr:hover td{

                background-color: rgba(255, 88, 0, 0.76);

            }
            .CSSTableGenerator tr:nth-child(odd){ background-color:#e5e5e5; }
            .CSSTableGenerator tr:nth-child(even)    { background-color:#ffffff; }.CSSTableGenerator td{
                vertical-align:middle;
                border:1px solid #000000;
                border-width:0px 1px 1px 0px;
                text-align:left;
                padding:7px;
                font-size:12px;
                font-family:Arial;
                font-weight:normal;
                color:#000000;
            }.CSSTableGenerator tr:last-child td{
                border-width:0px 1px 0px 0px;
            }.CSSTableGenerator tr td:last-child{
                border-width:0px 0px 1px 0px;
            }.CSSTableGenerator tr:last-child td:last-child{
                border-width:0px 0px 0px 0px;
            }
            .CSSTableGenerator tr:first-child td{
                    background:-o-linear-gradient(bottom, #cccccc 5%, #b2b2b2 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #b2b2b2) );
                background:-moz-linear-gradient( center top, #cccccc 5%, #b2b2b2 100% );
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#b2b2b2");	background: -o-linear-gradient(top,#cccccc,b2b2b2);

                background-color:#cccccc;
                border:0px solid #000000;
                text-align:center;
                border-width:0px 0px 1px 1px;
                font-size:19px;
                font-family:Arial;
                font-weight:bold;
                color:#000000;
            }
            .CSSTableGenerator tr:first-child:hover td{
                background:-o-linear-gradient(bottom, #cccccc 5%, #b2b2b2 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #b2b2b2) );
                background:-moz-linear-gradient( center top, #cccccc 5%, #b2b2b2 100% );
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#b2b2b2");	background: -o-linear-gradient(top,#cccccc,b2b2b2);

                background-color:#cccccc;
            }
            .CSSTableGenerator tr:first-child td:first-child{
                border-width:0px 0px 1px 0px;
            }
            .CSSTableGenerator tr:first-child td:last-child{
                border-width:0px 0px 1px 1px;
            }
            -->
        /*]]>*/
        </style>
    </head>
    <body>
        <?php
            include("../include/conexion.php");
            conectarBD();
        
            $cliente = "SELECT cl.* FROM albaranes a inner join contratos c on c.id = a.fk_contrato inner join clientes cl on c.fk_cliente =                cl.id WHERE a.id=".$_GET['id'];
        
            $resultcliente = mysql_query($cliente);
            $rowcliente = mysql_fetch_array($resultcliente);
        ?>

                        <h2>Albarán: <?php echo $rowcliente['id'];?></h2>
                    <h3>
                        <?php   
                            echo "Empresa: ".$rowcliente['empresa']."<br>";
                            echo "Numero de contacto: ".$rowcliente['contacto']."<br>";
                            echo "Domicilio: ".$rowcliente['domicilio']."<br>";
                            echo "Población: ".$rowcliente['poblacion']."<br>";
                            echo "Teléfono: ".$rowcliente['telefono'];
                ?><br><br><br>
            <div id="CompanyLogo"><img src="<?php echo '../logo.png'?>" alt="Logo" /></div>
        </div>

        
        <h2>Albarán generado:</h2>
            <table class="CSSTableGenerator">
                <tr>	
                    <td>Proveedor</td>
                    <td>Fecha de publicación</td>
                    <td>Concepto</td>
                    <td>Importe:</td>
                </tr>
                <?php
                    $totalimporte = 0;

                    $lineasContrato = "SELECT lc.* from albaranes a inner join lineas_contrato lc on a.fk_contrato = lc.fk_contratos WHERE  a.id=".$_GET['id'];
    
                    $resultadolineas = mysql_query($lineasContrato);
                    while($rowlineas = mysql_fetch_array($resultadolineas))
                    {
                ?>
                    <tr>
                        <td>
                            <?php
                                    $proveedor = "SELECT nombre FROM proveedor where id=".$rowlineas['fk_proveedor'];
                                    $resultadoprov = mysql_query($proveedor);
                                    $rowprov = mysql_fetch_array($resultadoprov);
                                    echo $rowprov['nombre'];
                            ?>
                        </td>
                        <td><?php echo $rowlineas['f_publicacion']?></td>
                        <td><?php echo $rowlineas['concepto']?></td>
                        <td><?php echo $rowlineas['importe']." €"?></td>
                    </tr>
                <?php
                        $totalimporte = $totalimporte + $rowlineas['importe'];
                    } 
                ?>
            </table>
            <br>
            <table class="CSSTableGenerator">
                <tr><td>Total</td><td></td></tr>
                <tr>
		    <td>Total Bruto: </td>
                    <td>
                        <?php echo $totalimporte." €"?>
                    </td>
                    
                </tr>
                <tr>
                    <td>Total Iva: </td>
                    <td>
                        <?php 
                            $contrato = "SELECT iva FROM contratos";
                            $resultcontrato = mysql_query($contrato);
                            $rowcontrato = mysql_fetch_array($resultcontrato);
                            echo $totalimporte * ($rowcontrato['iva'] / 100)." €";
                        ?>
                    </td>
                </tr>
                <tr>
                    <td>Total con iva: </td>
                    <td>
                        <?php
                            $coniva = ($totalimporte * $rowcontrato['iva'] / 100) + $totalimporte;
                            echo $coniva." €";
                        ?>
                    </td>
                </tr>
            </table>
        </div>
        <?php
            cerrarBD();
        ?>
    </body>
</html>