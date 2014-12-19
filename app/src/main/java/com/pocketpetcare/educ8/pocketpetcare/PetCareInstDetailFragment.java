package com.pocketpetcare.educ8.pocketpetcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.pocketpetcare.educ8.pocketpetcare.petsToCareForInst.PetsToCareForContent;

/**
 * A fragment representing a single petCareInst detail screen.
 * This fragment is either contained in a {@link PetCareInstListActivity}
 * in two-pane mode (on tablets) or a {@link PetCareInstDetailActivity}
 * on handsets.
 */
public class PetCareInstDetailFragment extends Fragment {

    private String introA;
    private String introB;


    //((TextView) rootView.findViewById(R.id.introA)).setText(mItem.content);

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */


    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private PetsToCareForContent.PetsToCareForInst mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PetCareInstDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);








        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.


            mItem = PetsToCareForContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

        }
/*
        nItem = PetsToCareForContent.Hatter
    */






    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.petcaredetails, container, false);


        //Button ff = ((Button) rootView.findViewById(R.id.button1));
        //ff.setText("ooooooog");

        //Button qq = ((Button) rootView.findViewById(R.id.button2));




        //Button qq = ((Button) rootView.findViewById(R.id.button2));


        // Show the dummy content as text in a TextView.
        if (mItem != null) {

            //((TextView) rootView.findViewById(R.id.petcareinst_detail)).setText(mItem.content);

            //((TextView) rootView.findViewById(R.id.textViewTest1)).setText("Hello World");

            //((TextView) rootView.findViewById(R.id.introA)).setText(mItem.content);

            switch (mItem.content){
                case "Amphibians":
                    introA = "Coming Soon";
                    introB = "Coming Soon";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.amphibians);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Arachnids":
                    introA = "Coming Soon";
                    introB = "Coming Soon";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.arachnids);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Bird":
                    introA = "Experts recommend several different species for first-time companion bird caretakers. They have very different personalities, so you’ll have to do a little research to find the bird that best fits your family’s lifestyle.";
                    introB = "\n\nStep 1\nAnnual visits to the veterinarian.\n\n Step 2\nBuy the largest, most well-constructed cage (with installed or installable perches) you can afford. No matter the species, your bird will need a cage that’s large enough for her to stretch her wings and fly short distances.\n\nStep 3\nLine the bottom of the cage with plain paper or paper bags cut to size. A thorough cleaning of your pet’s cage is required once weekly.\n\nStep 4\nPlace the cage in a warm, bright part of the house, close to where the action is but away from all drafts and direct sunlight, off the floor.\n\n*** Avoid setting up the cage in or near the kitchen at all costs as they are to fumes which can be fatal. ***\n\nStep 5\nSeed is the traditional staple of a bird’s diet, pelleted food is also the way to go.\n\n*** Many birds enjoy fruits and veggies such as apples, pears, carrots, broccoli and leafy greens. Never feed your bird avocado, cherry pits, rhubarb or apple seeds. ***\n\nStep 6\nFresh, cold water should be available at all times. Change it at least once a day.\n\nStep 7\nIf you have a cockatiel or budgie or simular bird that is tamed and trained, she’ll need at least an hour of exercise out of the cage everyday. Small birds may enjoy ladders, swings and mirrors with bells, and wooden chew toys.\n\n\nSuggested Items\n\nWhen you first get your bird, you’ll need to spend about $75 for a cage. Food runs about $75 a year, plus $30 annually for toys and treats.\n\nWell-constructed cage, with several perches.\n\nBird seed or high-quality pelleted food.\n\nSpecies appropriate safe toys (lots of them!)\n\nPlain paper or “non-toxic” newspaper for cage bottom.";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.bird);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    //qq.setText("You clicked on " + mItem.content);
                    break;
                case "Cats":
                    introA = "Cats are not low maintenance animals. They need attention and things such as; Food, water, litter pan, a scratching post, toys, exercise, veterinary care and, of course, love.";
                    introB = "\n\nStep 1\n" +
                            "Make sure that you take your cat to the vet regularly for any vaccinations needed, and general check ups.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Groom your cat regularly. Grooming is very important. It prevents hairballs and stimulates your cats' blood flow.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Choose a good quality dry cat food. Cheap brands often don't contain the essential nutrients cats and kittens need to grow and remain healthy.\n" +
                            "Always check the ingredients of the cat food you're giving to your cat. Sometimes, cats won't eat if they can see the bottom of their bowls!\n" +
                            "\n" +
                            "*** Make sure it doesn't have any bad ingredients that can make a cat sick such as: Chocolate, Onions, Garlic, Candy, Grapes, Sweets, Cookies, cake, and Wheat, are toxic to \n" +
                            "your cat. If your cat has ingested one of these things, you should call the Animal Poison Control Center ((888).426.4435 in the US). ***\n" +
                            "\n" +
                            "Step 4\n" +
                            "Provide a fresh water everyday, cats need fresh water all the time and can get dehydrated easily.\n" +
                            "\n" +
                            "Step 5\n" +
                            "If cats don't have a scratching post they might resort to your sofa! A cardboard box is a good alternative.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Find time to bond with your cat. Even ten minutes chasing a rubber ball around the house together is good. A little love goes a long way.\n" +
                            "\n" +
                            "Step 7\n" +
                            "It would be wise to scoop the litter pan two times daily. Otherwise, the house will smell bad. Make sure it is placed out of the reach of babies, young children, and other animals like dogs.\n" +
                            "\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "\n" +
                            "Litter scooper, Litter, and Litter box.\n" +
                            "\n" +
                            "Two bowls one for food and one for water.\n" +
                            "\n" +
                            "Scratching post and Cat nip (optional).";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.cats);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Dogs":
                    introA = "Caring for a dog is not difficult, but it does take an investment of time just as any addition to the family does. Whether you have a new puppy or an older dog the basics of proper care are the same: In addition to food and water, dogs need training, exercise, veterinary care and, of course, love.";
                    introB = "\n\nPuppy\n" +
                            "\n" +
                            "Make sure that the puppy you are getting is right for you. Does its coat suit your climate? Is it small enough to live in your apartment or house? Do its energy levels suit the amount of exercise it will get? These are all important questions to answer to ensure the well-being of your puppy and the overall happiness of your household.\n" +
                            "\n" +
                            "\n" +
                            "Step 1 \n" +
                            "Get your puppy / dog a dog tag or micro-chipped.\n" +
                            "\n" +
                            "Step 2 \n" +
                            "Give him some affection to show that you love them.\n" +
                            "\n" +
                            "Step 3 \n" +
                            "Show your puppy around the house as soon as you bring him home.\n" +
                            "\n" +
                            "Step 4 \n" +
                            "Start housebreaking your dog the first day you bring it home.\n" +
                            "\n" +
                            "Step 5\n" +
                            "Crate training is helpful for many reasons. First of all, it curbs destructive behavior.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Teach your dog basic commands.\n" +
                            "\n" +
                            "\n" +
                            "Dog\n" +
                            "\n" +
                            "Step 1\n" +
                            "Spay or neuter your dog as soon as he is old enough.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Schedule regular veterinarian visits for your dog.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Feed your dog, if your dog hasn't had all of his/her teeth come in you may want to consider canned food or wetting their food with water until all of their teeth have come in.\n" +
                            "\n" +
                            "*** Never give him bones that splinter easily, like chicken bones and keep fresh water available at all times. Even more serious, grapes, raisins, tea, alcohol, garlic, onions, avocados, salt, and chocolate, among other things, are toxic to your dog. If your dog has ingested one of these things, you should call the Animal Poison Control Center ((888).426.4435 in the US). ***\n" +
                            "\n" +
                            "Step 4\n" +
                            "Make sure your puppy always has adequate fresh water available. Unlike food, you should leave a full bowl of fresh water out for your dogs at all times.\n" +
                            "\n" +
                            "Step 5\n" +
                            "Give your dog something safe to chew on.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Train your dog in basic commands such as \"sit,\" \"stay\" and \"off\".\n" +
                            "\n" +
                            "Step 7\n" +
                            "Make sure your dog gets plenty of exercise.\n" +
                            "\n" +
                            "Step 8\n" +
                            "Always leash your dog when he's outside.\n" +
                            "\n" +
                            "Step 9\n" +
                            "Only bathe your puppy once every 3 weeks or so.\n" +
                            "\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "\n" +
                            "Metal tag (with your dog's name, your phone number, and your address)\n" +
                            "\n" +
                            "Two stainless steel bowls one for food and one for water.\n" +
                            "Chew toys, Puppy treats, Dewormer, Flea and tick collar and a comfortable bed.\n" +
                            "\n" +
                            "Basic grooming tools (brush, nail clippers)\n" +
                            "Pet Insurance (optional)\n" +
                            "\n" +
                            "(if living outside)\n" +
                            "Dog house in the shade and out of the chill winter winds \n" +
                            "Nylon leash and Metal stake out anchor";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.dog);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Fish (Cold Water)":
                    introA = "Congratulations, you’re going to be a fish parent! While your role may not be as interactive as that of a dog or cat caretaker, there are some important skills—such as tank set-up and maintenance—you’ll need to master to ensure a happy, healthy home for your fish.";
                    introB = "\n\nStep 1\n" +
                            "A 20 gallon aquarium is recomended for beginners, keep in mind that it will be easier to maintain healthy water conditions with a larger tank\n" +
                            "\n" +
                            "Step 2\n" +
                            "Select fish who will get along with each other and can thrive in a coldwater tank.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Set up the tank on sturdy table, stand, or counter, do not put the tank in direct sunlight. You won’t be able to move it once it is set up. \n" +
                            "\n" +
                            "Step 4\n" +
                            "Set up your tank and get it running for several days to a week, allowing the water to “ripen,” before you add fish. Setup your décor, fish may not care if their gravel is color coordinated, but they’ll greatly appreciate a “hiding” places to chill out.\n" +
                            "\n" +
                            "Step 5\n" +
                            "Next, set up the filtration system. Your aquarium will need one or more filters to maintain water quality. Without proper filtration, fish waste can poison the water and your fish. The most common types of filters are box filters, undergravel filters, and outside filters.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Check the ph of the water, most fish do best in water that has a near neutral pH level around 7 neither acidic nor alkaline (check with the pet store for your individual needs). Test your water with a kit from the pet supply store. \n" +
                            "\n" +
                            "Step 7\n" +
                            "You will also need to provide a light source for your fish with a combination aquarium cover/light fixture. The light should usually be on a schedule of 12 hours on, 12 hours off.\n" +
                            "\n" +
                            "Step 8\n" +
                            "Start your tank with 3 to 4 small or 1 to 2 medium-sized fish. Simply float the bag in the tank for 15 to 30 minutes, so that the temperature of the water in the bag is the same as the temperature of the tank. Carefully open the bags and let your fish swim out on their own.\n" +
                            "\n" +
                            "Step 9\n" +
                            "There are very good commercial fish foods available, dried flakes provide a balanced diet, and fresh foods such as live brine shrimp, bloodworms and tubifex worms provide variety.\n" +
                            "\n" +
                            "*** Number one rule when it comes to fish nutrition: DO NOT OVERFEED! Excess food will reducing the water quality. Feed several small just enough so the fish eat everything before it falls to the bottom. ***\n" +
                            "\n" +
                            "A quick and cheap (actually, free!) snack for your pets: Scrape off any algae growing on the front glass of the tank so your fish are clearly visible, but let it grow on one end or in a corner. Your fish will enjoy nibbling on the bits of algae growing there.\n" +
                            "\n" +
                            "Step 10\n" +
                            "Maintenance:\n" +
                            "\n" +
                            "Daily: You will need to monitor the water temperature. Coldwater tanks do not require a heater, but you will want to ensure that the temperature remains relatively constant. An inexpensive liquid crystal thermometer that attaches to the outside of tank will work great.\n" +
                            "\n" +
                            "Weekly: Every week or two, remove several gallons of water from the tank and replace it with clean, pre-aged water removing chemicals that build up in the aquarium.\n" +
                            "\n" +
                            "Monthly: Clean the filter or replace the charcoal and filter pads monthly. If you have plants, it’s time to prune them.\n" +
                            "\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "\n" +
                            "\n" +
                            "20-gallon tank, gravel, rocks, filter, wood and other tank decorations. \n" +
                            "\n" +
                            "Food, algae scraper, net, water testing kit, aquarium cover/light fixture, thermometer, plants (optional), stand (optional).";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.fishcoldwater);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Fish (Salt Water)":
                    introA = "Salt water unlike coldwater setups are really kind of difficult. There are three common types of saltwater aquarium setups. The Fish Only, the Fish Only with Live Rock and a reef tank. The fish only set up is really kind of difficult in terms of biological control of the filter. Live rock is awesome and will become the primary biological filter in your tank. Reef tanks require a little more precision and can be much more expensive to set up and stock because they require more equipment and more expensive livestock.";
                    introB = "\n\nStep 1\n" +
                            "If you want to set up a smaller saltwater tank (anything less than 30 gallons) then you'll have your work cut out for you. Although a smaller tank is going to cost less, the downside is that smaller tanks are harder to maintain, harder to keep stable and you have restrictions in fish types.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Things you will have to gather in order to do have a succesful saltwater tank with live rock is an aquarium at least a 30 gallons, a substrate sand bed either shallow, deep, or a bare bottom. Live Rock at about one pound per gallon high quality being porous rock and base rock on the cheaper end. Saltwater Mix, Refractometer to measure the salt content or a hydrometer but are less accurate. A protein skimmer without a skimmer means you will have to do way more frequent partial water changes to avoid algae issues. \n" +
                            "\n" +
                            "Power heads which are very important provides water movement, you want to have turbulent flows. Reverse Osmosis Water Filter needed for the initial filling and top offs of your tank to prevent algae issues. A heater and thermometer to monitor the tank temperature. Test Kits for testing of ammonia, nitrite and nitrates, and a sump and/or Refugium.\n" +
                            "\n" +
                            "If you chose a to have a saltwater reef tank, here is a list of equipment needed:\n" +
                            "Aquarium, substrate either sand or bare bottom, salt mix reef type which is usually higher in alk/calc. Live rock a refractometer, protein skimmer, power heads how many needed is based on the fish. Reverse osmosis water filter you will need more than one. A heater, test kits (liquid test kit perferabally) for ammonia, nitrite, nitrates, magnesium, alkalinity, calcium and phosphates.\n" +
                            "\n" +
                            "Lights, the corals you want to keep will dictate the type of lighting you need. A calcium reactor if you plan on having a tank full of hard corals a calcium reactor is the way to go, otherwise you can supplement with the two-part solutions and replenish needed elements via water changes. A sump and/or Refugium, A refugium allows you to grow macro algae and pods for the benefit of the display tank. Various reactors you can set up more reactors in your sump for Biopellets, Phosphate reducers, activated carbon, etc. These are optional but can bring some good benefits.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Research the fish, inverts and corals. This is the most important part of the entire process since it dictates the equipment and tank that you need. It's what makes the hobby so much fun.\n" +
                            "\n" +
                            "For a live rock tank your research required is much less. You basically need to research the compatibility of the fish you are interested in keeping and figure out how well they interact with conspecifics and other species, how to feed and what size tank you'll need.\n" +
                            "\n" +
                            "For a reef tank you have your research cut out for you. First figure out the type of corals you want to keep, it is best to stick with one type and avoid mixing coral types. Research the fish and inverts too, you'll want \"reef safe\" type fish and inverts.\n" +
                            "\n" +
                            "Step 4\n" +
                            "Set up the saltwater tank and equipment. Once everything is set up you want to make sure your tank cycles.\n" +
                            "\n" +
                            "Step 5\n" +
                            "Once your tank has cycled you can start to slowly introduce livestock. Take your time and make sure you acclimate your new arrivals correctly as this period is crucial and mistakes are made when things are rushed.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Develop a daily, weekly and monthly maintenance schedule and stick to it.\n" +
                            "\n" +
                            "Click here for more details\n" +
                            "http://www.fishlore.com/fishforum/saltwater-beginners/118422-starting-sw-system-part-1-start-research.html";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.fishsaltwater);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Guinea Pigs":
                    introA = "Guinea pigs are often calm and docile, but still make lively pets. They are vocal when excited and will make a variety of sounds when they see their favorite people or when the fridge door is opened (they love treats!). Guinea pigs rarely bite and are good pets for children who are old enough to handle them carefully and treat them with respect.\n";
                    introB = "\n\nStep 1\n" +
                            "Guinea pigs need a minimum of eight square feet of floor space in their cages and solid flooring instead of wired.\n" +
                            "\n" +
                            "Step 2\n" +
                            "When guinea pigs are frightened, they either freeze in place or run away, and prefer a hiding place in their cage. Normally paper or pine bedding several inches thick serves as a good bedding. Remove soiled bedding, droppings and stale food from the cage daily , clean and change the cage twice weekly.\n" +
                            "\n" +
                            "*** Cedar shavings should not be used as bedding, and are harmful to many small pets guinea pigs. ***\n" +
                            "\n" +
                            "Step 3\n" +
                            "Small pets love to play be sure to provide yours with an exercise wheel. Toys will be very appreciated, but toys made of soft plastic or cardboard will certainly be chewed to bits! They love to climb in tubes and tunnels often making a closed ended tunnel thier resting area.\n" +
                            "\n" +
                            "Step 4\n" +
                            "Guinea pig pellets should make up the bulk of your pet’s diet. Feed your guinea pigs twice daily, in the morning and in the evening. Offering small amounts of fresh fruit and vegetables to your guinea pigs every day. Grapes, cucumbers, corn, peas, carrots and pears. \n" +
                            "\n" +
                            "Half a handful of veggies and a slice of fresh fruit per pig is plenty, clean up any leftover fresh food before it spoils. Grass hay should be available at all times. \n" +
                            "\n" +
                            "Guinea pigs cannot manufacture Vitamin C, so you’ll need to ensure that your pets get enough of this essential nutrient every day. A quarter of an orange will do, but you can also include some fruits and veggies that are high in C to their daily amounts of fresh foods, such as kale, dandelion greens and strawberries.\n" +
                            "\n" +
                            "Step 5\n" +
                            "Clean, fresh water, dispensed in an inverted bottle with a drinking tube is perfect for your pet, make sure to change the water daily.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Once hand-tamed you should let them run around in a small room or enclosed area you will need to carefully check the room for openings keeping in mind they must be supervised when loose because they will chew on anything in their paths including wires.\n" +
                            "\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "\n" +
                            "Guinea pig pellets, vegetables and fruit snacks, guinea pig hay. \n" +
                            "\n" +
                            "Guinea Pig Cage, water bottle, vitamin C, bedding\n";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.guineapigs);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Rabbits":
                    introA = "Rabbits are inquisitive, intelligent, sociable and affectionate, many parents see rabbits as low-maintenance starter pets for kids. Nothing could be further from the truth. Rabbits are physically delicate and fragile. They can be trained to use a litter box, they’ll come when called, and some will engage their owners in a daily game of tag! Domestic rabbits are delightful companion animals.";
                    introB = "\n\nStep 1\n" +
                            "You should bring your pet to the vet for a check-up once a year if no signs of sickness or illness are apparent.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Rabbits require a lot of room for housing, get your pet a cage that allows him to move freely. The minimum recommended cage space is four feet wide, two feet deep and two feet tall.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Normally paper or timothy hay bedding several inches thick which will need to be changed daily is best for your pet.\n" +
                            "\n" +
                            "*** Cedar shavings should not be used as bedding, and are harmful to rabbits. ***\n" +
                            "\n" +
                            "Step 4\n" +
                            "Your rabbit needs a safe exercise area with ample room to run and jump, either indoors or out. Safe chew toys include cardboard boxes, old telephone directorys and commercially made chew sticks are great for a rabbits overall happiness. You bunny will appreciate his own digging box, such as a cardboard box filled halfway with soil or shredded paper.\n" +
                            "\n" +
                            "Step 5\n" +
                            "The most important component of your rabbit’s diet is grass hay, Unlimited hay should be available at all times. Rabbit pellets make up the second type of food your rabbit should have followed by Fresh leafy greens, lettuces, collard, turnip and carrot tops.\n" +
                            "\n" +
                            "Step 6\n" +
                            "Clean, fresh water, dispensed in a bottle or sturdy bowl, should be available at all times.\n" +
                            "\n" +
                            "*** Do not be alarmed if you see your rabbit eating his feces. It is perfectly normal and healthy providing nutrients and aiding in digestion. ***\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "Cage, preferably solid-bottom, carrier.\n" +
                            "\n" +
                            "Rabbit food pellets, Grass hay, Litter box with hay or pelleted bedding.\n" +
                            "\n" +
                            "Ceramic or metal food and water bowl or cage water bottle.\n" +
                            "\n" +
                            "Grooming brush, digging box and safe chew toys";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.rabbits);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Reptiles":
                    //qq.setText("You clicked on " + mItem.content);
                    break;
                case "Small Pets":
                    introA = "Small pets can be a great addition to a family. These busy little rodents generally grow to about four inches, with a tail of the same length. All small pets are very frisky, and can easily escape from a cage that isn’t closed securely. Gerbils are gentle critters are hearty and seldom bite, unlike hamsters, they are most active during the day, which fits in well with a child’s schedule. With many different types of small pets to choose from its best to research which will best fit your family.";
                    introB = "\n\nStep 1\n" +
                            "A wire cage or a 10-gallon aquarium that has a wire mesh cover, lined with absorbent bedding. \n" +
                            "\n" +
                            "Step 2\n" +
                            "cedar shavings at all costs—the fumes from these products may be harmful to the animal. Also make sure that you change the litter often enough to keep it dry and odor-free.\n" +
                            "\n" +
                            "Research what would be best for your small pet normally shredded paper, timothy hay, or aspen shavings are used for bedding at about several inches thick. Remove soiled bedding, droppings and stale food from the cage daily, clean and change the cage at least once a week.\n" +
                            "\n" +
                            "*** Cedar shavings should not be used as bedding, and are harmful to many small pets . ***\n" +
                            "\n" +
                            "Step 3\n" +
                            "Small pets love to play be sure to provide yours with an exercise wheel. Toys will be very appreciated, but toys made of soft plastic or cardboard will certainly be chewed to bits! They love to climb in tubes and tunnels often making a closed ended tunnel thier resting area.\n" +
                            "\n" +
                            "Step 4\n" +
                            "Depending on the type of small pet you have its food will be slightly different with all contain some of the following seeds, grains, cracked corn and pellets. Gerbials eating gerbail seed, hamsters eating hamster seeds, mice and rats eating blocks and all eating some form of pellet of their pet type along with vegetables such as lettuce, carrots, and apples.\n" +
                            "\n" +
                            "*** Never give your pet uncooked beans, cabbage, onions, raw potato, peanuts, rhubarb, chocolate, candy or junk food. ***\n" +
                            "\n" +
                            "Step 5\n" +
                            "Clean, fresh water, dispensed in an inverted bottle, should be available at all times.\n" +
                            "\n" +
                            "Step 6\n" +
                            "It’s important that you get your pets used to being handled. Start by feeding them small treats. When they’re comfortable pick them up by scooping them into your hand. Never pick up a small pet by the tail, as this can cause injury.\n" +
                            "\n" +
                            "\n" +
                            "Suggested Items\n" +
                            "\n" +
                            "\n" +
                            "When you first get your pet, you’ll need to spend about $35 for a cage. Food runs about $50 a year, plus $20 annually for toys and treats, and $220 annually for litter and bedding material. We recommend purchasing your gerbils from a breeder or, even better, adopting them from a local shelter or small-animal rescue group.";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.reptiles);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;
                case "Other":
                    introA = "Coming Soon";
                    introB = "Coming Soon";

                    ((ImageView) rootView.findViewById(R.id.imageView2)).setImageResource(R.drawable.amphibians);
                    ((TextView) rootView.findViewById(R.id.introA)).setText(introA);
                    ((TextView) rootView.findViewById(R.id.introB)).setText(introB);
                    break;

            }
            //((Button) rootView.findViewById(R.id.button2)).setText(mItem.content);

           // qq.setText(mItem.content);

        }

        return rootView;
    }
}
