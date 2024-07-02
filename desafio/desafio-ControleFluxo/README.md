## Desafio de controle de fluxo

Este sistema dispõe de duas entradas via terminal de parametros numericos inteiros, a partir deles, imprime a quantidade de iterações feitas com os numeros incrementados. Exemplo
 - Se o primeiro numero for 1 e o segundo for 5, terá uma quantidade de 4 iterações, assim, o sistema mostrará: "Imprimindo o número 1", "Imprimindo o número 2", "Imprimindo o número 3" e "Imprimindo o número 4".
 - Caso o segundo parametro for um numero maior que o primeiro, ele não deverá imprimir a mensagem na mesma estrutura do primeiro caso e devera disparar a exceção personalizada chamada `ParametrosInvalidosException`, contendo a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro"

## Esqueleto do codigo

Este desafio foi desenvolvido em cima do seguinte protótipo de codigo fornecido pela DIO:

```java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```