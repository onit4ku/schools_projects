<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//ES" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Contrato Generado</title>
        
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
            $id = $_GET['id'];
            $consulta ="SELECT * from contratos where id=".$id;
            $resultado = mysql_query($consulta);
            $row = mysql_fetch_array($resultado);
            $date = str_replace('/', '-', $row['fecha_contrato']);
            $fcontrato = date('d-m-Y', strtotime($date));
        ?>
        <div id="logo"><img src="<?php echo '../logo.png'?>" alt="Logo" /></div>
        <h3 id="primertitulo">Contrato N: <?php echo $row['id']?></h3>	
        <form id="creador">
            <br><br>
            <table class="CSSTableGenerator">
                <tr>
                    <?php 
                        $consulta2 = "SELECT * from clientes where id=".$row['fk_cliente'];
                        $resultado2 = mysql_query($consulta2);
                        $row2 = mysql_fetch_array($resultado2);
                    ?>
                    <td><span>Cliente: <?php echo $row2['empresa']?></span></td>
                </tr>						
                <tr>
                    <td><span>Fecha de contrato: <?php echo $fcontrato?></span></td>
                </tr>
                <tr>
                    <td><span>Iva: <?php echo $row['iva']?>%</span></td>
                </tr>

                <tr>
                    <td><span>Forma de pago: <?php echo $row['forma_pago']?></span></td>
                </tr>
                <tr>
                    <td><span>Número de Vencimientos: <?php echo $row['nvencimiento']?></span></td>
                </tr>
                <tr>
                    <td><span>Cláusulas: <?php echo $row['clausulas']?></span></td>
                </tr>
                <tr>
                    <?php
                        $consulta3 = "SELECT * from comercial where id=".$row['fk_comercial'];				
                        $resultado3 = mysql_query($consulta3);
                        $row3 = mysql_fetch_array($resultado3);
                    ?>
                    <td><span>Comercial: <?php echo $row3['nombre']?></span></td>
                </tr>
            </table>
        </form>
    
 </body>
</html>
