
package sistemachamaae;

public class Cadastro {
    private int id;
    private String login;
    private String senha;
    private String status;
   
    
    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public String getStatus() {
        return status;
    }
     public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha= senha;
    }
    public void setStatus(String status) {
        this.status = status;
    }
  
    


}