# Exames Medical Records System

O Exames Medical Records System é um programa Java que permite cadastrar e exibir informações de diferentes tipos de exames médicos, incluindo glicemia, colesterol e triglicerídeos. O programa utiliza uma abordagem de herança para criar diferentes classes de exames, cada uma com seus próprios atributos e métodos específicos.

## Funcionamento

O programa consiste em várias classes que são organizadas hierarquicamente para representar diferentes tipos de exames médicos. Cada tipo de exame é representado por uma classe específica que herda características da classe base `Exame`.

### Classe Base - `Exame`

A classe base `Exame` contém os atributos e métodos comuns a todos os tipos de exames. Ela possui os seguintes atributos:

- `nome`: Nome do paciente.
- `tipoSanguineo`: Tipo sanguíneo do paciente.
- `anoNascimento`: Ano de nascimento do paciente.
- `idade`: Idade do paciente calculada a partir do ano de nascimento.

Além disso, a classe `Exame` possui métodos para cadastrar e exibir os detalhes do exame.

### Classe `Glicemia`

A classe `Glicemia` herda da classe `Exame` e representa um exame de glicemia. Ela possui atributos específicos para esse tipo de exame:

- `qtdGlicose`: Quantidade de glicose medida no exame.
- `resultadoGlicose`: Resultado da análise da glicose, classificada como "Normoglicemia", "Pré-diabetes" ou "Diabetes estabelecido".

Esta classe substitui os métodos `cadastrarExame` e `mostrarExame` da classe base `Exame` para lidar com informações específicas do exame de glicemia.

### Classe `Colesterol`

A classe `Colesterol` também herda da classe `Exame` e representa um exame de colesterol. Ela possui atributos específicos para esse tipo de exame:

- `qtdLDL`: Quantidade de LDL (lipoproteína de baixa densidade) medida no exame.
- `qtdHDL`: Quantidade de HDL (lipoproteína de alta densidade) medida no exame.
- `risco`: Risco associado ao paciente, categorizado como "B" (baixo), "M" (médio) ou "A" (alto).
- `resultadoLDL`: Resultado da análise do LDL, classificado como "LDL - BOM" ou "LDL - RUIM".
- `resultadoHDL`: Resultado da análise do HDL, classificado como "HDL - BOM" ou "HDL - RUIM".

A classe `Colesterol` também substitui os métodos `cadastrarExame` e `mostrarExame` da classe base `Exame` para lidar com informações específicas do exame de colesterol.

### Classe `Triglicerideos`

A classe `Triglicerideos` é outra subclasse da classe `Exame` e representa um exame de triglicerídeos. Ela possui atributos específicos para esse tipo de exame:

- `qtdTri`: Quantidade de triglicerídeos medida no exame.
- `resultadoTri`: Resultado da análise dos triglicerídeos, classificado como "Triglicerídeos Bom" ou "Triglicerídeos Ruim".

Assim como as outras subclasses, a classe `Triglicerideos` substitui os métodos `cadastrarExame` e `mostrarExame` da classe base `Exame` para lidar com informações específicas do exame de triglicerídeos.

## Utilização

O programa inicia na classe `Exames` com o método `main`. Nele, são criadas instâncias das classes `Glicemia`, `Colesterol` e `Triglicerideos`. Em seguida, para cada exame, os métodos `cadastrarExame` e `mostrarExame` são chamados para registrar os detalhes do exame e exibir as informações relevantes na forma de uma caixa de diálogo.

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções de bugs e adição de novos recursos a este sistema de registros médicos. Se desejar reportar problemas ou fazer sugestões, sinta-se à vontade para abrir um problema ou enviar um pull request.
