package ark04;

import javax.swing.JOptionPane;

public class ARK04 {

    public static void main(String[] args) {
        String mensagem = JOptionPane.showInputDialog("Informe os numeros a serem convertidos: ");
        String mensagem2 = "";
        String suporte = "";
        int x = 0;
        int y = 1;
        int j = mensagem.length();

        for (int i = 0; i < j; i++) {
            suporte = mensagem.substring(x, y);
            if (suporte.equals("1")) {
                suporte = "00000001";
                mensagem2 = mensagem2.concat(suporte);
            } else {
                if (suporte.equals("2")) {
                    suporte = "00000010";
                    mensagem2 = mensagem2.concat(suporte);
                } else {
                    if (suporte.equals("3")) {
                        suporte = "00000011";
                        mensagem2 = mensagem2.concat(suporte);
                    } else {
                        if (suporte.equals("4")) {
                            suporte = "00000100";
                            mensagem2 = mensagem2.concat(suporte);
                        } else {
                            if (suporte.equals("5")) {
                                suporte = "00000101";
                                mensagem2 = mensagem2.concat(suporte);
                            } else {
                                if (suporte.equals("6")) {
                                    suporte = "00000110";
                                    mensagem2 = mensagem2.concat(suporte);
                                } else {
                                    if (suporte.equals("7")) {
                                        suporte = "00000111";
                                        mensagem2 = mensagem2.concat(suporte);
                                    } else {
                                        if (suporte.equals("8")) {
                                            suporte = "00001000";
                                            mensagem2 = mensagem2.concat(suporte);
                                        } else {
                                            if (suporte.equals("9")) {
                                                suporte = "00001001";
                                                mensagem2 = mensagem2.concat(suporte);
                                            } else {
                                                if (suporte.equals("0")) {
                                                    suporte = "00000000";
                                                    mensagem2 = mensagem2.concat(suporte);
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Informe apenas numeros!\n O programa será encerrado!");
                                                    System.exit(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            x = x + 1;
            y = y + 1;
        }
        JOptionPane.showMessageDialog(null, "Resutado: " + mensagem2 + ".");
    }
}
