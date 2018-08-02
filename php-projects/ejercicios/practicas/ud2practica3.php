<?php
$num=0;
$result=0;

echo "<h2>Con While</h2>";

while($num<=10){
	
	$result=2*$num;
	
	echo "2 x $num = $result<br>";
	
	$num=$num+1;
}

echo "<h2>Con For</h2>";

for($i=0; $i<11; $i++){

	$result=2*$i;

	echo "2 x $i = $result<br>";

}

?>