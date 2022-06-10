public class App {
    public static void main(String[] args) throws Exception {
        // Funcionários
        Funcionario f[] = new Funcionario[2];
        f[0] = new Funcionario("Carla", 37, 4581, 2500f);
        f[1] = new Funcionario("Anderson", 25, 5841, 1870f);

        System.out.println("Funcionários do hospital:");
        for (Funcionario funcionario : f) {
            System.out.println(funcionario.toString());
        }

        // Médicos
        Medico m[] = new Medico[3];
        m[0] = new Medico("Pedro", 55, 6519, 5000f, "Cardiologia");
        m[1] = new Medico("Letícia", 38, 2181, 4700f, "Endocrinologia");
        m[2] = new Medico("Augusto", 29, 4156, 3000f, "Clínico Geral");

        System.out.println("Médicos do hospital:");
        for (Medico medico : m) {
            medico.setPlantao(true);
            System.out.println(medico.toString());
        }

        // Pacientes
        Paciente p[] = new Paciente[5];
        p[0] = new Paciente("Mário", 45, "Severa", 95.9f, 1.79f);
        p[1] = new Paciente("Mirela", 32, "Moderada", 75.7f, 1.71f);
        p[2] = new Paciente("Elisa", 15, "Leve", 65.5f, 1.65f);
        p[3] = new Paciente("Cláudio", 28, "Moderada", 85.1f, 1.76f);
        p[4] = new Paciente("Alfredo", 75, "Moderada", 79.2f, 1.86f);

        System.out.println("Pacientes do hospital:");
        for (Paciente paciente : p) {
            System.out.println(paciente.toString());
        }

        // Prontuários
        Prontuario pro[] = new Prontuario[5];
        pro[0] = new Prontuario(p[0], m[0]);
        pro[1] = new Prontuario(p[1], m[1]);
        pro[2] = new Prontuario(p[2], m[2]);
        pro[3] = new Prontuario(p[3], m[1]);
        pro[4] = new Prontuario(p[4], m[0]);

        // Ciclos de consulta
        pro[0].examinar();
        pro[0].diagnosticar("Paciente com grave coagulação nos vasos do coração.");
        pro[0].receitar();
        pro[0].internar();
        System.out.println(pro[0].toString());

        pro[1].examinar();
        pro[1].diagnosticar("Paciente com alteração hormonal caracterizando hipoteroidismo");
        pro[1].receitar("Levotiroxina", 1, 12);
        pro[1].liberar();
        System.out.println(pro[1].toString());

        pro[2].examinar();
        pro[2].diagnosticar("Paciente apresenta dores moderadas devido à contusão.");
        pro[2].receitar("Tramal", 50);
        pro[2].liberar();
        System.out.println(pro[2].toString());

        pro[3].examinar();
        pro[3].diagnosticar("Paciente diabético com glicose elevada apresenta tonturas.");
        pro[3].receitar("Insulina", 20);
        pro[3].internar();
        System.out.println(pro[3].toString());

        pro[4].examinar();
        pro[4].diagnosticar("Paciente com leve palpitação causada por estresse.");
        pro[4].receitar("Buspar", 1, 8);
        pro[4].liberar();
        System.out.println(pro[4].toString());

        // Pagamento dos funcionários e médicos
        System.out.println("Pagamento dos funcionários:");
        for (Funcionario funcionario : f) {
            funcionario.receber();
        }

        System.out.println("Pagamento dos médicos:");
        for (Medico medico : m) {
            medico.receber();
            medico.setPlantao(false);
        }
    }
}
