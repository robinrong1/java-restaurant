import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StorageRoom {

	protected HashMap<String, Integer> ingredients = new HashMap<String, Integer>();
	JLabel fishPatty;
	JLabel porkPatty;
	JLabel chickenPatty;
	JLabel beefPatty;
	JLabel pickle;
	JLabel cheese;
	JLabel lettuce;
	JLabel redCab;
	JLabel onion;
	JLabel pieCrust;
	JLabel sugar;
	JLabel potato;
	JLabel gravy;
	JLabel cone;
	JLabel milk;
	JLabel chicken;
	JLabel bread;
	JLabel cof;
	JLabel coke;
	JLabel ice;
	public StorageRoom(JPanel cardPanel, CardLayout cl) {
		initIngredients();
		initGUI(cardPanel, cl);
	}
	public void initIngredients() {
		ingredients.put("fish patty", 100);
		ingredients.put("pork patty", 100);
		ingredients.put("chicken patty", 100);
		ingredients.put("beef patty", 100);
		ingredients.put("pickles", 100);
		ingredients.put("cheese", 100);
		ingredients.put("lettuce", 0);
		ingredients.put("red cabbage", 100);
		ingredients.put("onion", 100);
		ingredients.put("pie crust", 100);
		ingredients.put("sugar", 100);
		ingredients.put("potato", 100);
		ingredients.put("gravy", 100);
		ingredients.put("waffle cone", 100);
		ingredients.put("milk", 100);
		ingredients.put("chicken",100);
		ingredients.put("bread",100);
		ingredients.put("coke",100);
		ingredients.put("coffee",100);
		ingredients.put("ice",100);
	}

	public void initGUI(JPanel cardPanel, CardLayout cl) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		Stocker stocker = new Stocker();


		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		mainPanel.add(buttonPanel);

		JButton back = new JButton("Main Menu");
		back.addActionListener(new ActionListener() {//go to management interface
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cardPanel, "1");
			}
		});

		JButton refresh = new JButton("refresh");
		refresh.addActionListener(new ActionListener() {//go to management interface
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fishPatty.setText("fish patty: " + ingredients.get("fish patty"));
				porkPatty.setText("pork patty: " + ingredients.get("pork patty"));
				chickenPatty.setText("chicken patty: " + ingredients.get("chicken patty"));
				beefPatty.setText("beef patty: " + ingredients.get("beef patty"));
				pickle.setText("pickles: " + ingredients.get("pickles"));
				cheese.setText("cheese: " + ingredients.get("cheese"));
				lettuce.setText("lettuce: " + ingredients.get("lettuce"));
				redCab.setText("red cabbage: " + ingredients.get("red cabbage"));
				onion.setText("onion: " + ingredients.get("onion"));
				pieCrust.setText("pie crust: " + ingredients.get("pie crust"));
				sugar.setText("sugar: " + ingredients.get("sugar"));
				potato.setText("potato: " + ingredients.get("potato"));
				gravy.setText("gravy: " + ingredients.get("gravy"));
				cone.setText("waffle cone: " + ingredients.get("waffle cone"));
				milk.setText("milk: " + ingredients.get("milk"));
				chicken.setText("chicken: " + ingredients.get("chicken"));
				bread.setText("bread: " + ingredients.get("bread"));
				cof.setText("coffee: " + ingredients.get("coffee"));
				coke.setText("coke: " + ingredients.get("coke"));
				ice.setText("ice: " + ingredients.get("ice"));
			}
		});

		buttonPanel.add(refresh);
		buttonPanel.add(back);
		JPanel fishPatPanel = new JPanel();
		fishPatPanel.setLayout(new FlowLayout());
		fishPatty = new JLabel("fish patty: " + ingredients.get("fish patty"));
		fishPatPanel.add(fishPatty);
		JButton restockFishPat = new JButton("Restock");
		fishPatPanel.add(restockFishPat);
		mainPanel.add(fishPatPanel);
		restockFishPat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				stocker.restock("fish patty", ingredients, fishPatty);
			}
		});
		JPanel porkPatPanel = new JPanel();
		porkPatPanel.setLayout(new FlowLayout());
		porkPatty = new JLabel("pork patty: " + ingredients.get("pork patty"));
		porkPatPanel.add(porkPatty);
		JButton restockPorkPat = new JButton("Restock");
		porkPatPanel.add(restockPorkPat);
		mainPanel.add(porkPatPanel);
		restockPorkPat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("pork patty", ingredients, porkPatty);
			}
		});

		JPanel chickenPatPanel = new JPanel();
		chickenPatPanel.setLayout(new FlowLayout());
		chickenPatty = new JLabel("chicken patty: " + ingredients.get("chicken patty"));
		chickenPatPanel.add(chickenPatty);
		JButton restockChickenPat = new JButton("Restock");
		chickenPatPanel.add(restockChickenPat);
		mainPanel.add(chickenPatPanel);
		restockChickenPat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("chicken patty", ingredients, chickenPatty);
			}
		});

		JPanel beefPatPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		beefPatty = new JLabel("beef patty: " + ingredients.get("beef patty"));
		beefPatPanel.add(beefPatty);
		JButton restockBeefPat = new JButton("Restock");
		beefPatPanel.add(restockBeefPat);
		mainPanel.add(beefPatPanel);
		restockBeefPat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("beef patty", ingredients, beefPatty);
			}
		});

		JPanel picklePanel = new JPanel();
		picklePanel.setLayout(new FlowLayout());
		pickle = new JLabel("pickles: " + ingredients.get("pickles"));
		picklePanel.add(pickle);
		JButton restockPickle = new JButton("Restock");
		picklePanel.add(restockPickle);
		mainPanel.add(picklePanel);
		restockPickle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("pickles", ingredients, pickle);
			}
		});

		JPanel cheesePanel = new JPanel();
		cheesePanel.setLayout(new FlowLayout());
		cheese = new JLabel("cheese: " + ingredients.get("cheese"));
		cheesePanel.add(cheese);
		JButton restockCheese = new JButton("Restock");
		cheesePanel.add(restockCheese);
		mainPanel.add(cheesePanel);
		restockCheese.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("cheese", ingredients, cheese);
			}
		});

		JPanel lettucePanel = new JPanel();
		lettucePanel.setLayout(new FlowLayout());
		lettuce = new JLabel("lettuce: " + ingredients.get("lettuce"));
		lettucePanel.add(lettuce);
		JButton restockLettuce = new JButton("Restock");
		lettucePanel.add(restockLettuce);
		mainPanel.add(lettucePanel);
		restockLettuce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("lettuce", ingredients, lettuce);
			}
		});

		JPanel redCabPanel = new JPanel();
		redCabPanel.setLayout(new FlowLayout());
		redCab = new JLabel("red cabbage: " + ingredients.get("red cabbage"));
		redCabPanel.add(redCab);
		JButton restockRedCab = new JButton("Restock");
		redCabPanel.add(restockRedCab);
		mainPanel.add(redCabPanel);
		restockRedCab.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("red cabbage", ingredients, redCab);
			}
		});

		JPanel onionPanel = new JPanel();
		onionPanel.setLayout(new FlowLayout());
		onion = new JLabel("onion: " + ingredients.get("onion"));
		onionPanel.add(onion);
		JButton restockOnion = new JButton("Restock");
		onionPanel.add(restockOnion);
		mainPanel.add(onionPanel);
		restockOnion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("onion", ingredients, onion);
			}
		});

		JPanel pieCrustPanel = new JPanel();
		pieCrustPanel.setLayout(new FlowLayout());
		pieCrust = new JLabel("pie crust: " + ingredients.get("pie crust"));
		pieCrustPanel.add(pieCrust);
		JButton restockPieCrust = new JButton("Restock");
		pieCrustPanel.add(restockPieCrust);
		mainPanel.add(pieCrustPanel);
		restockPieCrust.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("pie crust", ingredients, pieCrust);
			}
		});

		JPanel sugarPanel = new JPanel();
		sugarPanel.setLayout(new FlowLayout());
		sugar = new JLabel("sugar: " + ingredients.get("sugar"));
		sugarPanel.add(sugar);
		JButton restockSugar = new JButton("Restock");
		sugarPanel.add(restockSugar);
		mainPanel.add(sugarPanel);
		restockSugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("sugar", ingredients, sugar);
			}
		});

		JPanel potatoPanel = new JPanel();
		potatoPanel.setLayout(new FlowLayout());
		potato = new JLabel("potato: " + ingredients.get("potato"));
		potatoPanel.add(potato);
		JButton restockPotato = new JButton("Restock");
		potatoPanel.add(restockPotato);
		mainPanel.add(potatoPanel);
		restockPotato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("potato", ingredients, potato);
			}
		});

		JPanel gravPanel = new JPanel();
		gravPanel.setLayout(new FlowLayout());
		gravy = new JLabel("gravy: " + ingredients.get("gravy"));
		gravPanel.add(gravy);
		JButton restockGravy = new JButton("Restock");
		gravPanel.add(restockGravy);
		mainPanel.add(gravPanel);
		restockGravy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("gravy", ingredients, gravy);
			}
		});

		JPanel conePanel = new JPanel();
		conePanel.setLayout(new FlowLayout());
		cone = new JLabel("waffle cone: " + ingredients.get("waffle cone"));
		conePanel.add(cone);
		JButton restockCone = new JButton("Restock");
		conePanel.add(restockCone);
		mainPanel.add(conePanel);
		restockCone.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("cone", ingredients, cone);
			}
		});

		JPanel milkPanel = new JPanel();
		milkPanel.setLayout(new FlowLayout());
		milk = new JLabel("milk: " + ingredients.get("milk"));
		milkPanel.add(milk);
		JButton restockMilk = new JButton("Restock");
		milkPanel.add(restockMilk);
		mainPanel.add(milkPanel);
		restockMilk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("milk", ingredients, milk);
			}
		});

		JPanel chickenPanel = new JPanel();
		chickenPanel.setLayout(new FlowLayout());
		chicken = new JLabel("chicken: " + ingredients.get("chicken"));
		chickenPanel.add(chicken);
		JButton restockChicken = new JButton("Restock");
		chickenPanel.add(restockChicken);
		mainPanel.add(chickenPanel);
		restockChicken.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("chicken", ingredients, chicken);
			}
		});

		JPanel breadPanel = new JPanel();
		breadPanel.setLayout(new FlowLayout());
		bread = new JLabel("bread: " + ingredients.get("bread"));
		breadPanel.add(bread);
		JButton restockBread = new JButton("Restock");
		breadPanel.add(restockBread);
		mainPanel.add(breadPanel);
		restockBread.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("bread", ingredients, bread);
			}
		});

		JPanel cofPanel = new JPanel();
		cofPanel.setLayout(new FlowLayout());
		cof = new JLabel("coffee: " + ingredients.get("coffee"));
		cofPanel.add(cof);
		JButton restockCof = new JButton("Restock");
		cofPanel.add(restockCof);
		mainPanel.add(milkPanel);
		restockCof.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("coffee", ingredients, cof);
			}
		});

		JPanel cokePanel = new JPanel();
		cokePanel.setLayout(new FlowLayout());
		coke = new JLabel("coke: " + ingredients.get("coke"));
		cokePanel.add(coke);
		JButton restockCoke = new JButton("Restock");
		cokePanel.add(restockCoke);
		mainPanel.add(cokePanel);
		restockCoke.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("coke", ingredients, coke);
			}
		});

		JPanel icePanel = new JPanel();
		icePanel.setLayout(new FlowLayout());
		ice = new JLabel("ice: " + ingredients.get("ice"));
		icePanel.add(ice);
		JButton restockIce = new JButton("Restock");
		icePanel.add(restockIce);
		mainPanel.add(icePanel);
		restockIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stocker.restock("ice", ingredients, ice);
			}
		});
		
		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		cardPanel.add(mainPanel, "5");
	}

}