public class Caio_Leoni_TSPOO {
    public static void main(String[] args) {
        Caio_Leoni_TS opc = new Caio_Leoni_TS();

        opc.inserirOrdem("Diamante", "Leoni");
        opc.inserirOrdem("Esmeralda", "Caio");

        opc.listarOrdens();

        opc.atualizarOrdem(1, "Rubi", "Inoel");
        opc.atualizarOrdem(2, "Safira", "Oiac");

        opc.listarOrdens();


        opc.inserirTemplo("Atenas", "Grécia", 1);
        opc.inserirTemplo("Pérsia", "Turquia", 2);

        opc.listarTemplos();

        opc.atualizarTemplo(1, "Moscou", "Rússia");
        opc.atualizarTemplo(2, "Oslo", "Noruega");

        opc.listarTemplos();


        opc.inserirGuardiao("Metaki", "Flashes", 1);
        opc.inserirGuardiao("Nilum", "Zoom", 2);

        opc.listarGuardioes();

        opc.atualizarGuardiao(1, "Odely", "Glosmas");
        opc.atualizarGuardiao(2, "Prik", "SuperForça");

        opc.listarGuardioes();


        opc.inserirArtefato("Metronome", "contador_de_tempo", 1);
        opc.inserirArtefato("Badogue", "Mirar_e_atirar", 2);

        opc.listarArtefatos();

        opc.atualizarArtefato(1, "Capacete", "Fornece_proteção");
        opc.atualizarArtefato(2, "Arpão", "Atravessa_e_traspassa");

        opc.listarArtefatos();


        opc.inserirHistorico(1, "Ascensão_do_saber", 180723);
        opc.inserirHistorico(2, "Queda_da_Hierarquia", 485633);

        opc.listarHistoricos();

        opc.atualizarHistorico(1, "Sumiço_dos_lacaios", 227748);
        opc.atualizarHistorico(2, "Confabulação_Prolongada", 582152);

        opc.listarHistoricos();


        opc.deletarOrdem(2);
        opc.deletarTemplo(1);
        opc.deletarGuardiao(1);
        opc.deletarArtefato(2);
        opc.deletarHistorico(2);

        opc.listarOrdens();
        opc.listarTemplos();
        opc.listarGuardioes();
        opc.listarArtefatos();
        opc.listarHistoricos();
    }
}