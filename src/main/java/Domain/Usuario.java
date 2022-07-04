
package Domain;

public class Usuario {
    private int id_usuario;
    private String nameUsuario;
    private String lastnameUsuario;
    private String describeUsuario;
    private String recomendUsuario;
    private String featureUsuario;
    private String improveUsuario;
    private String commentUsuario;
    
    
    public Usuario(){
        
    }
    
    //caso eliminar por el ID

    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    //caso insertar todos menos ID

    public Usuario(String nameUsuario, String lastnameUsuario, String describeUsuario, String recomendUsuario, String featureUsuario, String improveUsuario, String commentUsuario) {
        this.nameUsuario = nameUsuario;
        this.lastnameUsuario = lastnameUsuario;
        this.describeUsuario = describeUsuario;
        this.recomendUsuario = recomendUsuario;
        this.featureUsuario = featureUsuario;
        this.improveUsuario = improveUsuario;
        this.commentUsuario = commentUsuario;
    }

    //caso editar todos los campos y necesito ID
    public Usuario(int id_usuario, String nameUsuario, String lastnameUsuario, String describeUsuario, String recomendUsuario, String featureUsuario, String improveUsuario, String commentUsuario) {
        this.id_usuario = id_usuario;
        this.nameUsuario = nameUsuario;
        this.lastnameUsuario = lastnameUsuario;
        this.describeUsuario = describeUsuario;
        this.recomendUsuario = recomendUsuario;
        this.featureUsuario = featureUsuario;
        this.improveUsuario = improveUsuario;
        this.commentUsuario = commentUsuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getLastnameUsuario() {
        return lastnameUsuario;
    }

    public void setLastnameUsuario(String lastnameUsuario) {
        this.lastnameUsuario = lastnameUsuario;
    }

    public String getDescribeUsuario() {
        return describeUsuario;
    }

    public void setDescribeUsuario(String describeUsuario) {
        this.describeUsuario = describeUsuario;
    }

    public String getRecomendUsuario() {
        return recomendUsuario;
    }

    public void setRecomendUsuario(String recomendUsuario) {
        this.recomendUsuario = recomendUsuario;
    }

    public String getFeatureUsuario() {
        return featureUsuario;
    }

    public void setFeatureUsuario(String featureUsuario) {
        this.featureUsuario = featureUsuario;
    }

    public String getImproveUsuario() {
        return improveUsuario;
    }

    public void setImproveUsuario(String improveUsuario) {
        this.improveUsuario = improveUsuario;
    }

    public String getCommentUsuario() {
        return commentUsuario;
    }

    public void setCommentUsuario(String commentUsuario) {
        this.commentUsuario = commentUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nameUsuario=" + nameUsuario + ", lastnameUsuario=" + lastnameUsuario + ", describeUsuario=" + describeUsuario + ", recomendUsuario=" + recomendUsuario + ", featureUsuario=" + featureUsuario + ", improveUsuario=" + improveUsuario + ", commentUsuario=" + commentUsuario + '}';
    }

    
    
    
}
