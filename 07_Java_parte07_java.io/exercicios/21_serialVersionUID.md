É boa prática colocar o atributo estático serialVersionUID na classe quando queremos serializar um objeto:

private static final long serialVersionUID = 1L;

Para que serve o atributo serialVersionUID?

Resposta:

O serialVersionUID define a versão atual da classe e esse valor fica gravado na representação binária do objeto.

Pois o serialVersionUID é da classe (por isso estático) e define a versão ou identificação numérica da classe. Cada vez que alteramos algo incompatível na classe, devemos alterar o seu valor.

Sempre quando serializamos o objeto, também será serializado o valor do serialVersionUID.