package pmsn.estabelecimento;

import pmsn.equipamentos.Digitalizadora.Digitalizadora;
import pmsn.equipamentos.Impressora.Impressora;
import pmsn.equipamentos.Impressora.Laserjet;
import pmsn.equipamentos.copiadora.Copiadora;
import pmsn.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
