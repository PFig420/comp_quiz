## Group members
&nbsp;

| NMec | Name | email | Contribution (%) | Detailed contribution [1]
|:-:|:--|:--|:-:|:--|
| 97487 | Pedro  Figueiredo | palexandre09@ua.pt | 16,(6)% | primary-grammar (16,(6)%)<br>secondary-grammar (16,(6)%)<br>secondary-semantic-analysis (50%)<br>secondary-interpretation/secondary-code-generation (50%)<br>examples 16,(6)(%)<br>testing 16,(6)%
| 97939 | Tomé Carvalho     | tomecarvalho@ua.pt | 16,(6)% | primary-grammar (16,(6)%)<br>code-generation (50 %)<br>secondary-grammar (16,(6)%)<br>examples 16,(6)(%)<br>testing 16,(6)%<br>Java classes (Block, BlockQuiz, Match, Option, QM, QMBuilder, QMC, QMCBuilder, Question, Quiz) 100%
| 98324 | Henrique Sousa    | hsousa@ua.pt | 16,(6)% | primary-grammar (16,(6)%)<br>code-generation (50 %)<br>secondary-grammar (16,(6)%)<br>examples 16,(6)(%)<br>testing 16,(6)%
| 98396 | Vítor Francisco Ribeiro Dias | vfrd00@ua.pt | 16(6)% | primary-grammar (16,(6)%)<br>secondary-grammar (16,(6)%)<br>secondary-semantic-analysis (50%)<br>secondary-interpretation/secondary-code-generation (50%)<br>examples 16,(6)(%)<br>testing 16,(6)%
| 98599 | Miguel Rocha Ferreira | miguel.r.ferreira@ua.pt | 16,(6)% | primary-grammar (16,(6)%)<br> primary-semantic-analysis (50%)<br>secondary-grammar (16,(6)%)<br>examples 16,(6)(%)<br>testing 16,(6)%
| 98607 | Diana Elisabete Siso Oliveira | diana.siso@ua.pt | 16,(6)% | primary-grammar (16,(6)%)<br> primary-semantic-analysis (50%)<br>secondary-grammar (16,(6)%)<br>examples 16,(6)(%)<br>testing 16,(6)%
[1] Topics:<br>
   primary-grammar (%)<br>primary-semantic-analysis (%)<br>code-generation (%)<br>secondary-grammar (%)<br>secondary-semantic-analysis (%)<br>secondary-interpretation/secondary-code-generation (%)<br>examples (%)<br>testing (%)<br>other (%) (explain)

- Beware that within the group the sum for each topic must be 100% (obviously).

## Material to be evaluated

- Beware that **only** the code in the **master** branch will be considered for evaluation.

## Compilation & Run

- Explain how to compile and run language code.

- Preferable option is to provide scripts *compile* and *run*, accepting program filename as argument.

Estão disponíveis os seguintes scripts na pasta src: build.sh, compile.sh e run.sh.

build.sh (args: nenhum): faz o build de ambas as gramáticas

compile.sh (args: nome do ficheiro .buzz na pasta examples): invoca o build.sh, compila para .java o ficheiro de exemplo especificado e coloca o mesmo na pasta output.

run.sh: Compila o ficheiro QuizOutput.java da pasta output, corre o programa e, no fim, limpa os ficheiros .class.

Os passos para correr um programa escrito na nossa linguagem são os seguintes (no diretório src):

(/src) $ ./compile.sh [nome do ficheiro .buzz]

(/src) $ ./run.sh

## Working examples (at least two)

Use examples to show the language functionalities.

Para todos estes exemplos as respostas dadas pelo utilizador são guardadas num ficheiro separado na pasta output.

1. `../examples/ExampleBlockQuiz.buzz`

    Neste exemplo criamos um BlockQuiz e adicionamos blocos de perguntas ao mesmo.

    Temos ainda vários exemplos de manipulação de questões, assim como de outros tipos de dados.

    Neste exemplo as perguntas são criadas por nós, não são carregadas de nenhum banco de dados.
    
    Como correr o programa:
    
    (/src) $ ./compile.sh ExampleBlockQuiz.buzz
    
    (/src) $ ./run.sh


2. `../examples/ExampleQuiz.buzz`

    Neste exemplo criamos um Quiz e adicionamos perguntas soltas ao mesmo.
    
    A diferença entre o Quiz e o BlockQuiz é que no Quiz não é permitido adicionar Blocos de Perguntas, apenas perguntas soltas. Para além disso, o BlockQuiz possui atributos extra próprios a esta estrutura de dados.
    
    Temos ainda vários exemplos de manipulação de questões, assim como de outros tipos de dados.
    
    Neste exemplo as perguntas são criadas por nós, não são carregadas de nenhum banco de dados.
    
    Como correr o programa:
    
    (/src) $ ./compile.sh ExampleQuiz.buzz
    
    (/src) $ ./run.sh
     
    
3. `../examples/ExampleLoad.buzz`

	Neste exemplo criamos um Quiz e adicionamos perguntas soltas ao mesmo.

	No entanto, neste exemplo não criamos as perguntas, elas são diretamente carregadas do banco de dados (referência aos ficheiros no ponto 4).

    Como correr o programa:
    
    (/src) $ ./compile.sh ExampleLoad.buzz
    
    (/src) $ ./run.sh

4. `../examples/Football.buzzqb  e ../examples/Formula1.buzzqb`

   Estes são exemplos do banco de dados, que permite carregar perguntas para um programa da linguagem principal.
   


## Semantic error examples

1. `../examples/SemanticErrors`

    No ficheiro SemanticQuiz realizamos a avaliação semântica da nossa linguagem.
    
    Neste ficheiro utilizamos visitors de forma a aceder às diferentes partes da gramática e fazemos a análise semântica das mesmas.
    
    De forma a analisar o processo de depuração semântica, criamos um ficheiro de teste chamado SemanticErrors (Path especificado no início desta secção) onde temos vários exemplos de cada visitor (correspondendo estes exemplos a situações de erro e outros a situações de sucesso.
    
    
    No ficheiro SemanticQuiz, sempre que ocorre um erro semântico, o mesmo é armazenado numa ArrayList situada no ficheiro StaticValues.java e depois serão impressos quando o programa for executado.
    
    Caso existam erros na análise semântica, não será feita a compilação do programa.

