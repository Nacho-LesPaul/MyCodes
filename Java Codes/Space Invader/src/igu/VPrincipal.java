package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import logica.*;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel pnTablero;
	private JButton bt0;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	private JButton bt7;
	private JButton btDado;
	private JLabel lbNave;
	private JLabel lbPlaneta;
	private JTextField txPuntos;
	private JPanel pnDisparos;
	private JLabel lbPuntos;
	private Juego juego;
	/**
	 * Create the frame.
	 */
	public VPrincipal(Juego juego) {
		this.juego = juego;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VPrincipal.class.getResource("/img/spaceship.png")));
		setResizable(false);
		setTitle("Invasor espacial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 402);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtDado());
		contentPane.add(getLbNave());
		contentPane.add(getLbPlaneta());
		contentPane.add(getTxPuntos());
		contentPane.add(getLbPuntos());
		contentPane.add(getPnDisparos());
		contentPane.add(getPnTablero());
		
		setLocationRelativeTo(null);
		habilitaTablero(false);
	}
	private JPanel getPnTablero() {
		if (pnTablero == null) {
			pnTablero = new JPanel();
			pnTablero.setBackground(Color.BLUE);
			pnTablero.setBorder(new LineBorder(Color.BLUE, 5));
			pnTablero.setBounds(22, 233, 792, 99);
			pnTablero.setLayout(new GridLayout(0, 8, 5, 0));
			pnTablero.add(getBt0());
			pnTablero.add(getBt1());
			pnTablero.add(getBt2());
			pnTablero.add(getBt3());
			pnTablero.add(getBt4());
			pnTablero.add(getBt5());
			pnTablero.add(getBt6());
			pnTablero.add(getBt7());
		}
		return pnTablero;
	}
	
	private void iniciarJuego() {
		juego.lanzar();
		
		pintarDisparos();
		getBtDado().setEnabled(false);
		habilitaTablero(true);
	}
	
	private void pintarDisparos() {
		for (int i=0; i<juego.getDisparos(); i++) {
			pnDisparos.add(nuevoDisparo());
		}
		validate();
	}
	
	private JLabel nuevoDisparo() {
		JLabel lbDisparo;
		lbDisparo = new JLabel("");
		lbDisparo.setBorder(new LineBorder(new Color(0, 255, 0), 2));
		lbDisparo.setIcon(ImagenFactoria.getImagen());
		return lbDisparo;
	}
	
	private JButton getBt0() {
		if (bt0 == null) {
			bt0 = new JButton("");
			bt0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(0);
				}
			});
			bt0.setEnabled(false);
			bt0.setBackground(Color.BLACK);
		}
		return bt0;
	}
	private JButton getBt1() {
		if (bt1 == null) {
			bt1 = new JButton("");
			bt1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(1);
				}
			});
			bt1.setEnabled(false);
			bt1.setBackground(Color.BLACK);
		}
		return bt1;
	}
	private JButton getBt2() {
		if (bt2 == null) {
			bt2 = new JButton("");
			bt2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(2);
				}
			});
			bt2.setEnabled(false);
			bt2.setBackground(Color.BLACK);
		}
		return bt2;
	}
	private JButton getBt3() {
		if (bt3 == null) {
			bt3 = new JButton("");
			bt3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(3);
				}
			});
			bt3.setEnabled(false);
			bt3.setBackground(Color.BLACK);
		}
		return bt3;
	}
	private JButton getBt4() {
		if (bt4 == null) {
			bt4 = new JButton("");
			bt4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(4);
				}
			});
			bt4.setEnabled(false);
			bt4.setBackground(Color.BLACK);
		}
		return bt4;
	}
	private JButton getBt5() {
		if (bt5 == null) {
			bt5 = new JButton("");
			bt5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(5);
				}
			});
			bt5.setEnabled(false);
			bt5.setBackground(Color.BLACK);
		}
		return bt5;
	}
	private JButton getBt6() {
		if (bt6 == null) {
			bt6 = new JButton("");
			bt6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(6);
				}
			});
			bt6.setEnabled(false);
			bt6.setBackground(Color.BLACK);
		}
		return bt6;
	}
	private JButton getBt7() {
		if (bt7 == null) {
			bt7 = new JButton("");
			bt7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispara(7);
				}
			});
			bt7.setEnabled(false);
			bt7.setBackground(Color.BLACK);
		}
		return bt7;
	}
	
	private void dispara (int i) {
		juego.dispara(i);
		
		getTxPuntos().setText(String.valueOf(juego.getPuntos()));
		quitarDisparos();
		mostrarCasilla(i);
		if (juego.isPartidaFinalizada()) {
			JOptionPane.showMessageDialog(this, "Partida finalizada", "Invasion espacial", JOptionPane.INFORMATION_MESSAGE);
			habilitaTablero(false);
		}
	}
	
	private void mostrarCasilla(int i) {
		ImageIcon imagen = ImagenFactoria.getImagen(juego.getTablero().getCasillas()[i]);
		((JButton)getPnTablero().getComponents()[i]).setIcon(imagen);
		((JButton)getPnTablero().getComponents()[i]).setDisabledIcon(imagen);
	}
	
	private void quitarDisparos() {
		getPnDisparos().remove(0);
		getPnDisparos().repaint();
	}
	
	private void habilitaTablero(boolean b) {
		for (int i = 0; i<pnTablero.getComponents().length; i++) {
			((JButton)pnTablero.getComponents()[i]).setEnabled(b);
		}
	}
	private JButton getBtDado() {
		if (btDado == null) {
			btDado = new JButton("");
			btDado.setDisabledIcon(new ImageIcon(VPrincipal.class.getResource("/img/dice.jpg")));
			btDado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					iniciarJuego();
				}
			});
			btDado.setIcon(new ImageIcon(VPrincipal.class.getResource("/img/dice.jpg")));
			btDado.setToolTipText("Haga click para lanzar el dado");
			btDado.setBorderPainted(false);
			btDado.setBorder(null);
			btDado.setBackground(Color.BLACK);
			btDado.setBounds(31, 24, 112, 107);
		}
		return btDado;
	}
	private JLabel getLbNave() {
		if (lbNave == null) {
			lbNave = new JLabel("");
			lbNave.setIcon(new ImageIcon(VPrincipal.class.getResource("/img/spaceship.png")));
			lbNave.setBounds(214, 31, 144, 80);
		}
		return lbNave;
	}
	private JLabel getLbPlaneta() {
		if (lbPlaneta == null) {
			lbPlaneta = new JLabel("");
			lbPlaneta.setIcon(new ImageIcon(VPrincipal.class.getResource("/img/earth.jpg")));
			lbPlaneta.setBounds(609, 26, 205, 178);
		}
		return lbPlaneta;
	}
	private JTextField getTxPuntos() {
		if (txPuntos == null) {
			txPuntos = new JTextField();
			txPuntos.setHorizontalAlignment(SwingConstants.CENTER);
			txPuntos.setForeground(Color.GREEN);
			txPuntos.setFont(new Font("Consolas", Font.BOLD, 30));
			txPuntos.setEditable(false);
			txPuntos.setColumns(10);
			txPuntos.setBackground(Color.BLACK);
			txPuntos.setBounds(433, 76, 137, 35);
			
			txPuntos.setText(String.valueOf(juego.getPuntos()));
		}
		return txPuntos;
	}
	private JPanel getPnDisparos() {
		if (pnDisparos == null) {
			pnDisparos = new JPanel();
			pnDisparos.setBackground(Color.BLACK);
			pnDisparos.setBounds(153, 123, 265, 74);
		}
		return pnDisparos;
	}
	private JLabel getLbPuntos() {
		if (lbPuntos == null) {
			lbPuntos = new JLabel("Puntos:");
			lbPuntos.setForeground(Color.WHITE);
			lbPuntos.setFont(new Font("Tahoma", Font.PLAIN, 22));
			lbPuntos.setBounds(433, 41, 86, 27);
		}
		return lbPuntos;
	}
}
