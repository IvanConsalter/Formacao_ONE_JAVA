Como foi visto nos vídeos, quando tentamos colocar um valor inteiro em uma variável do tipo double o Java não mostra erro. Quando tentamos, porém, colocar um double numa variável do tipo inteiro temos um erro de compilação.

Esta propriedade se dá porque o Java faz conversão implícita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.

O contrário não é verdade por que existe perda de dados quando é feita a conversão. Acarretando em um "type mismatch" mostrando que esta instrução é de tipos incompatíveis.

Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting. Veja a instrução abaixo.

int idade = (int) 30.0;<br>
No caso acima, está explícito que será feito o cast de double para inteiro. Veja como funciona o cast implícito e explícito na tabela abaixo.<br>

DE/PARA	byte	short	char	int	long	float	double<br>
byte	----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.<br>
short	(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.<br>
char	(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.<br>
int	(byte)	(short)	(char)	----	Impl.	Impl.	Impl.<br>
long	(byte)	(short)	(char)	(int)	----	Impl.	Impl.<br>
float	(byte)	(short)	(char)	(int)	(long)	----	Impl.<br>
double	(byte)	(short)	(char)	(int)	(long)	(float)	----<br><br>
Para comparar cada tipo primitivo de forma mais clara, a tabela abaixo mostra qual o tamanho de cada um.<br>

TIPO	TAMANHO<br>
boolean	1 bit<br>
byte	1 byte<br>
short	2 bytes<br>
char	2 bytes<br>
int	4 bytes<br>
float	4 bytes<br>
long	8 bytes<br>
double	8 bytes<br>
