package beans;

public class Cadastro {

    private String nome;
    private String nascimento;
    private String cidade;
    private String faculdade;
    private String estado;     //combo box
    private String sexo;       //combo box
    private String tipoSangue; //combo box
    private String email;
    private String senha;

    public Cadastro() {// construtor vazio para testar a conexao mysql
    }

    ; 

//    public Cadastro(String nome, String nascimento, String cidade, String faculdade,
//            int estado, String sexo, int tipoSangue, String email, String senha) {
//
//        this.nome = nome;
//        this.email = email;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.faculdade = faculdade;
//        this.sexo = sexo;
//        this.tipoSangue = tipoSangue;
//        this.senha = senha;
//    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public String getEstado() {
        return estado;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void set(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}