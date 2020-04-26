Ao utilizar o método findFirst() temos como retorno um Optional<Curso>. Por quê?

Qual a vantagem de retornar um Optional no lugar de retornar um curso diretamente?

Ganhamos muito com essa nova introdução. Assim não precisamos escrever aqueles diversos ifs garantindo que o objeto não é nulo, temos uma forma muito mais interessante de representar nossas intenções. A classe Optional nos oferece uma variedade imensa de novos métodos que nos permite trabalhar de forma funcional com nossos valores, tirando maior proveito dos novos recursos de default methods, lambdas e method reference. Você pode ler mais sobre essa API em sua documentação:

http://docs.oracle.com/javase/8/docs/api/java/util/Optional.html