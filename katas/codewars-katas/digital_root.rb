def digital_root(n)
  reducido = n.to_s.chars.map(&:to_i).reduce(:+)
  if reducido.size > 1
    reducido.to_s.chars.map(&:to_i).reduce(:+)
  end
end

=begin

In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Here's how it works (Ruby example given):

digital_root(16)
=> 1 + 6
=> 7


Solución:

  &: para cada elemento del array map lo recoge y saca el resultado
  
  Transforma el numero en una string, lo separa en digitos, transforma cada uno en un entero y los suma.
  Vale para numeros de cualquier tamaño.
  
  el bloque del if es para cuando tienen mas de 2 digitos entonces se reduce siempre a 1

  Tests:

  Test.assert_equals( digital_root(16), 7 )
  Test.assert_equals( digital_root(161), 8 )

=end