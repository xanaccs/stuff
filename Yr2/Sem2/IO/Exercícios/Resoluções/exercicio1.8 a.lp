/*

problema de localiza��o - exercicio 1.8 a)

objectivo: minimiza��o das dist�ncia percorridas entre o dep�sito e os clientes

*/

// x, y - coordenadas do dep�sito (assume-se coloca��o num ponto da grelha, e portanto >= 0)
//
// NOTA: as vari�veis x e y podem ser fraccion�rias;
//       se se pretender que o local fique na intersec��o de 2 tra�os do quadriculado,
//       as vari�veis x e y devem ser declaradas como inteiras

// O cliente j est� localizado no ponto com coordenadas  ( coord_xj ,coord_yj )
// A dist�ncia do cliente j ao dep�sito ao longo do eixo dos x � dada pelo valor absoluto de: x - coord_xj,  | x - coord_xj |
// O valor de (x - coord_xj) pode ser positivo ou negativo, consoante a posi��o relativa do cliente e do dep�sito.

// Vamos usar uma vari�vel sem restri��o de sinal para representar (x - coord_xj).
// Uma vari�vel sem restri��o de sinal � expressa como a diferen�a entre duas vari�veis n�o negativas:
//  (x - coord_xj) = xjp - xjn
//  xjp expressa o valor de (x - coord_xj) quando (x - coord_xj) � positivo
//  xjn expressa o valor de (x - coord_xj) quando (x - coord_xj) � negativo

// A fun��o xjp + xjn expressa o valor absoluto da dist�ncia entre o dep�sito e o cliente j ao longo do eixo x.
//          xjp + xjn = |xjp, se a posi��o relativa for positiva
//                      |xjn, se a posi��o relativa for negativa

// o mesmo para a coordenada y

// dj = xjp + xjn + yjp + yjn = dist�ncia total entre o dep�sito e o cliente j (eixos x e y)


// se quis�ssemos minimizar a soma das dist�ncias, a f. objectivo seria:
// min:     d1 +    d2 +    d3 +     d4 +    d5;


min:  15 d1 +  8 d2 + 17 d3 +  12 d4 +  4 d5;

// posi��o relativa ao longo do eixo do x
x - 2 = x1p - x1n;
x -10 = x2p - x2n;
x - 1 = x3p - x3n;
x - 9 = x4p - x4n;
x - 3 = x5p - x5n;

// posi��o relativa ao longo do eixo do y
y - 8 = y1p - y1n;
y - 7 = y2p - y2n;
y - 3 = y3p - y3n;
y - 1 = y4p - y4n;
y - 6 = y5p - y5n;

// dist�ncia total (eixos x e y) entre o local e o cliente j
x1p + x1n + y1p + y1n = d1;
x2p + x2n + y2p + y2n = d2;
x3p + x3n + y3p + y3n = d3;
x4p + x4n + y4p + y4n = d4;
x5p + x5n + y5p + y5n = d5;











