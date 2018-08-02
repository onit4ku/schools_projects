<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ES" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Correo Php</title>

<style type="text/css">

input {
  padding: .2em;
}

label {
  display: block;
  margin: .5em 0 0 0;
}

input:focus {
  border: 2px solid #000;
  background: #F3F3F3;
}

</style>

</head>
<body>  
		<form name="contacto" action="correo2.php" method="post">           
         <label class="contact">Nombre:</label>
         <input type="text" name="nombre" class="contact_input" />
         <label >Email:</label>
         <input type="text" name="email"  />
         <label >Empresa:</label>
         <input type="text" name="empresa"  />
         <label >Mensaje:</label>
      	<textarea  name="mensaje" ></textarea></br></br>
      	<input type="submit"  value="Enviar" /> 
     	</form> 
</body>
</html>