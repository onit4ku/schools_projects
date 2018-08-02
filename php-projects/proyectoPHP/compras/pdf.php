<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <head>
        <title>Compras</title>
        
       <style type="text/css">
        /*<![CDATA[*/
        <!--
        body {
                text-align: left;
                white-space: normal;
                font-family: "Times New Roman", Times, serif;
                margin:0;
                padding:0;
                height: 11in; /*Letter Size Paper*/
                width: 8.5in; /*Letter Size Paper*/
                margin-left: 0.5in;
                margin-bottom: 0.5in;
        }
        #Addresses {
                position:relative;
                height:190px;	
                width:500px;
        }
        #ReturnAddress {
            position:absolute;
            width:3.5in; Your company logo (optional). You can change the size of the font and your company logo image to make it fit to the envelope window */
            height:0.792in;
            font-size: 9pt;
            z-index:100;
        }
        #CompanyLogo {
            position:absolute;
            left:400px;
            top:20px;
            width:1.45in;
            height:0.792in;
            z-index:10;
            text-align:right;
        }
        #RecipientAddress {
            position:absolute;
            top:1.542in;
            width:3.5in;
            height:0.875in;
            text-transform: uppercase;
            font-family:Arial, Helvetica, sans-serif;
            font-size: 10pt;
        }
        #RightSideContent {
            position:relative;
            border:thin #000000;
            left: 4.5in;
            height: 2.8in;
            width: 2.9in;
        }
        #BodyContent {
            position:relative;
            left:0;
            width:500px;
            font-size: 11pt;
            line-height: 1.5;
            white-space: normal;
            padding:0;
            margin-top:30px;
        }
        .PageBreak {
            page-break-after:always; /*Using this tag as a DIV class, forces a page break when printing the letter*/
            height:1px;
            margin:0;
            padding:0;
        }
        
        td {
            padding:5px;
           }
        -->
        /*]]>*/
        </style>
    </head>
    <body>
        <?php
            include("../include/conexion.php");
            conectarBD();
            $compras = "SELECT fecha_compra FROM compras WHERE id=".$_GET['id'];
            $proveedor = "SELECT pr.* FROM compras c inner join proveedor pr on c.fk_proveedor = pr.id WHERE c.id=".$_GET['id'];
        
            $resultcom = mysql_query($compras);
            $rowcom = mysql_fetch_array($resultcom);
            $resultprov = mysql_query($proveedor);
            $rowprov = mysql_fetch_array($resultprov);
        ?>
         <div id="Addresses">
        <!-- Return Address -->
            <div id="ReturnAddress">
            <span style="text-align:left">
                    <h2>Compra: <?php echo $rowprov['id'];?></h2>
                    <h3>Fecha de compra: <?php
                        $date = str_replace('/', '-', $rowcom['fecha_compra']);
                        $fcompra = date('d-m-Y', strtotime($date));
                        echo $fcompra. "<br>";

                    echo "Proveedor: ".$rowprov['nombre']."<br>";
                    echo "CIF/NIF: ".$rowprov['cif_nif']."<br>";
                    echo "Numero de contacto: ".$rowprov['contacto']."<br>";
                    echo "Teléfono: ".$rowprov['telefono'];

                    ;?>
                    </h3>
                </span>
        </div>
            <div id="CompanyLogo"><img src="<?php echo '../logo.png'?>" alt="Your Logo Here" /></div>
        
        <!-- Recipient Address -->
            <div id="RecipientAddress">
            </div>
        
        <!-- Content printed to the right side of the addresses. This content is not visible through the envelope windows. -->
            <div id="RightSideContent">
            </div>
        </div>
        <!-- Content of the letter -->
        <div id="BodyContent">
            <h2>Factura generada:</h2>
            <table border="2px">
                <tr>	
                    <td>Proveedor</td>
                    <td>Fecha de publicación</td>
                    <td>Concepto</td>
                    <td>Importe:</td>
                </tr>
                <?php
                    $totalimporte = 0;

                    $lineasCompra = "SELECT lc.* from compras c inner join lineas_compra lc on c.id = lc.fk_compra WHERE                                          c.id=".$_GET['id'];
    
                    $resultadolineas = mysql_query($lineasCompra);
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
                        <td><?php echo $rowlineas['fecha']?></td>
                        <td><?php echo $rowlineas['concepto']?></td>
                        <td><?php echo $rowlineas['importe']." €" ?></td>
                    </tr>
                <?php
                        $totalimporte = $totalimporte + $rowlineas['importe'];
                    } 
                ?>
            </table>
            <br>
            <table border="2px">
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
                            $compras = "SELECT iva FROM compras";
                            $resultcompra = mysql_query($compras);
                            $rowcompra = mysql_fetch_array($resultcompra);
                            echo $totalimporte * ($rowcompra['iva'] / 100)." €";
                        ?>
                    </td>
                </tr>
                <tr>
                    <td>Total con iva: </td>
                    <td>
                        <?php
                            $coniva = ($totalimporte * $rowcompra['iva'] / 100) + $totalimporte;
                            echo $coniva ." €";
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
