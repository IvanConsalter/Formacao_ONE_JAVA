Paulo está criando getters e setters para seguinte classe:

public class Aluno {

    private String nome;<br>
    private String matricula;<br>

}


Como ficaria, seguindo a convenção explicada no vídeo anterior, a declaração dos getters e setters para os dois atributos da classe?

Resposta:

public String getNome(){<br>
   return this.nome;<br>
}<br><br>

public String getMatricula(){<br>
   return this.matricula;<br>
}<br><br>

public void setMatricula(String matricula){<br>
   this.matricula = matricula;<br>
}<br><br>

public void setNome(String nome){<br>
   this.nome = nome;<br>
}<br>