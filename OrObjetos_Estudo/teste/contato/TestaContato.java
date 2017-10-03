package teste.contato;

public class TestaContato {

    public static void main(String[] args) {

        Contato contato1 = new Contato();

        Endereco end1 = new Endereco();

        end1.setNomeRua("Baker Street");
        end1.setNumero("221B");
        end1.setCidade("Londres");
        end1.setEstado("Reino Unido");
        end1.setCep("12345-678");

        Telefone tel1 = new Telefone();

        tel1.setTipo("Residencial");
        tel1.setDdi("+44");
        tel1.setDdd("20");
        tel1.setNumero("4321-8765");

        Telefone tel2 = new Telefone();

        tel2.setTipo("Celular");
        tel2.setDdi("+44");
        tel2.setDdd("07");
        tel2.setNumero("8765-4321");

        Telefone[] telefones1 = new Telefone[2];

        telefones1[0] = tel1;
        telefones1[1] = tel2;

        contato1.setNome("Sherlock Holmes");
        contato1.setEndereco(end1);
        contato1.setTelefones(telefones1);

        System.out.println(contato1.getNome());

        if (contato1.getEndereco() != null) {
            System.out.println(contato1.getEndereco().getNomeRua() + ", " + contato1.getEndereco().getNumero() + ", " + contato1.getEndereco().getCidade() + ", " + contato1.getEndereco().getEstado());
            System.out.println(contato1.getEndereco().getCep());
        }
        
        if (contato1.getTelefones() != null) {
            for(Telefone t : contato1.getTelefones()){
                System.out.println(t.getTipo() + ": " + t.getDdi() + " " + t.getDdd() + " " + t.getNumero());
            }
        }
    }

}
