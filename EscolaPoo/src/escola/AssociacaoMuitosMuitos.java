package escola;

public class AssociacaoMuitosMuitos {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina1.setCargaHoraria(80);

        Professor professor1 = new Professor();
        professor1.setNome("Jao");
        professor1.setMatricula(123);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(10);


        Professor professor2 = new Professor();
        professor2.setNome("Noa");
        professor2.setMatricula(234);
        professor2.setFormacaoAcademica("Licenciado");
        professor2.setSalario(30);

        //relaçao Jao com Matematica
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);

        //relaçao Jao com Portugues
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);

        //relação Noa com Portugues
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        //Listar as disciplinas do professor Jao
        System.out.println("\n\n\nDisciplinas do Jao");
        for (int i = 0; i < professor1.quantidadeDisciplinas(); i++){
            //Disciplina disciplina = professor1.getdisciplina(i);
            //System.out.println(disciplina.getNome());
            System.out.println(professor1.getdisciplina(i).getNome());
        }

        //Lista  de professores da disciplina de Portugues
        System.out.println("\n\nProfessores de portugues");
        for (int i = 0; i < disciplina2.quantidadeProfessor(); i++){
            System.out.println(disciplina2.getProfessor(i).getNome());
        }

    }
}
