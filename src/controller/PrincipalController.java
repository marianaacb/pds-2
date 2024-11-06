package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controller.LoginController.LoginListener;
import model.Usuarios;
import view.LoginView;
import view.PrincipalView;

public class PrincipalController {

	private LoginView loginView;
	private PrincipalView principalView;
	private Usuarios user;

	public PrincipalController(Usuarios user, PrincipalView principalView) {
		this.user = user;
		this.principalView = principalView;

		principalView.addPrincipalListener(new PrincipalListener());
	}

	// Classe interna para capturar o evento de clique
	class PrincipalListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Obtém o comando de ação do botão clicado
			String command = e.getActionCommand();

			// Se o comando for a ação do botão Login
			if (command.equals("menuSairAction")) {
				int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sair == 0) {
					System.exit(0);
				}

			} else if (command.equals("menuUsuariosAction")) {
				/*
				 * try { listarUsuarios(); } catch (SQLException e1) { // TODO Auto-generated
				 * catch block e1.printStackTrace(); }
				 */
			} else if (command.equals("menuSobreAction")) {
				JOptionPane.showMessageDialog(null, "Sistema de gestão Assistec - Versão 1.0");

			}
		}

	}

}
