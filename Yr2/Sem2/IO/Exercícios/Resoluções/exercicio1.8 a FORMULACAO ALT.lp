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
// o mesmo para a coordenada y

// vamos usar as vari�veis
// dxj = max { x - coord_xj , coord_xj - x } para representar o valor absoluto da dist�ncia ao longo do eixo dos x
// dyj = max { y - coord_yj , coord_yj - y } para representar o valor absoluto da dist�ncia ao longo do eixo dos y
//
// a dist�ncia total entre o dep�sito e o cliente j (eixos x e y) � dada por dj = dxj + dyj

// se quis�ssemos minimizar a soma das dist�ncias, a f. objectivo seria:
// min:     d1 +    d2 +    d3 +     d4 +    d5;


min:  15 d1 +  8 d2 + 17 d3 +  12 d4 +  4 d5;

// posi��o relativa ao longo do eixo do x
  x - 2 <= dx1;
- x + 2 <= dx1;
  x -10 <= dx2;
- x +10 <= dx2;
  x - 1 <= dx3;
- x + 1 <= dx3;
  x - 9 <= dx4;
- x + 9 <= dx4;
  x - 3 <= dx5;
- x + 3 <= dx5;

// posi��o relativa ao longo do eixo do y
  y - 8 <= dy1;
- y + 8 <= dy1;
  y - 7 <= dy2;
- y + 7 <= dy2;
  y - 3 <= dy3;
- y + 3 <= dy3;
  y - 1 <= dy4;
- y + 1 <= dy4;
  y - 6 <= dy5;
- y + 6 <= dy5;

// dist�ncia total (eixos x e y) entre o local e o cliente j
dx1 + dy1 = d1;
dx2 + dy2 = d2;
dx3 + dy3 = d3;
dx4 + dy4 = d4;
dx5 + dy5 = d5;






