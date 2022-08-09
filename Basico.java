/*
No README, vc entendeu o mínimo do Java, agora iremos entrar na linguagem junto com a OO. 

nota: sempre que eu usar o termo OO; saiba que significa: Orientação a objetos.

Se vc é programou uma única vez na vida, provavelmente sabe o que é um "Hello World" (significa literalmente: "Olá mundo"),
caso não saiba, vai saber :D, confia.

Em java, para exibir essa mensagem seria mais ou menos assim ↓↓↓↓. 
*/
System.out.print("Hello World");

/*
•Explicando o código acima:

System - É uma classe padrão do java que oferece os fluxos de entrada padrão, saída padrão, e saída de erro da linguagem. Você não precisa entender
         isso inicialmente, apenas entenda o funcionamento, mais pra frente, abordarei o conceito de Classes.
         
out - Método de saída padrão da classe System. Também entenderemos o que é um método mais à frente.

print() - método de exibição de valores; há outras variações desse método: println, prinf, explicarei-as depois.

E por fim, o bendito ";" no final de toda instrução java é necessário colocá-lo, pois isso indica o fim da instrução, caso não seja colocado, resultará em
erro de compilação.

Apesar de tudo, mesmo que vc copie o trecho de código acima, ainda sim dará erro, java é uma linguagem burocrática, para que isso desse certo teria que 
ser algo assim ↓↓
*/
Public class Basico {
  public static void main (String[] args) {
    System.out.print("Hello World");
  }
}

/*
•Explicando o código acima:

Temos a nossa clase denominada "Basico", por ela ser uma classe, então colocamos a palavra reservada do Java "class", antes do nome, e o modificador de
acesso, o "Public", esse modificador de acesso permite que eu consiga ter acesso aos atributos de uma classe pública, de outra classe distinta,
sem restrição, há outros modificadores de acesso: private e protect, mais pra frente veremos isso.

•Chegamos agora a uma parte fundamental; como rodar programas java?

é preciso instalar o JDK(Java Development kit), e o JRE(Java Runtime Enviroment). O JDK é o kit de ferramentas que oferece um ambiente para desenvolver
aplicações Java, e o JRE, simplesmente roda esses programas relacionados ao java em suas diferentes extenções: .java, .class, .jar. Não entrarei em
detalhes sobre a instalação de ambos, mas disponibilizarei um link para a instalação.

- https://www.oracle.com/java/technologies/downloads/ (<-- Download do JRE e JDK no site ofical da Oracle.)

•Rodando uma aplicação:

Após a instalação dos programas citados acima, é necessário verificar se o compilador do java está disponível e pronto para uso, como meu sistema é o
Linux mint XFCE, então alguns comandos podem não funcionar em outras plataformas, nesse caso, pesquise sobre e descubra sozinho, focarei aqui apenas no
Java propiamente dito.

nota: caso você nunca tenha nenhuma aplicação .java para rodar, baixe esse arquivo de um programa que eu mesmo criei no link:
      - https://github.com/dev-davisouza/SimpleChattyBot/archive/refs/heads/main.zip

- Abra um terminal e digite: javac; caso não retorne erros, podemos prosseguir, caso contrário, procure uma solução na internet.
- 





Bateu preguiça depois eu volto aqui;

ADM a mimir........😴
*/
