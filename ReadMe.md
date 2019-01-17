## Lab - Fantasy Adventure
The task is to model a fantasy adventure. The game will have players, who will have a number of health points and weapons/spells. Players will fall into different categories:

#### Dwarves, Barbarians, Knights
each of these will have a weapon and fight with other players (Sword, Axe, Club, etc)
should be able to change their weapon at any point in the game.

#### Warlocks and Wizards
they will be able to cast spells on others (Fireball, Lightning Strike, etc).
they will have a mythical creature (e.g. Ogre, Dragon) who will defend them from attackers.
should be able to change spells or creature at any point in the game.
#### Clerics
they will have healing tools with which they can heal other players (potion, herbs, etc).
should be able to change healing tool at any point in the game.
The game will also have rooms to work through. Each room should either have some kind of treasure (Gold, Gems) to collect or an Enemy (Troll, Orc) to defeat before moving on.

Remember
Use TDD
Git commit regularly

### MVP
- Create an abstract class Player. Each player will have a name and a number of health points.
- Create an abstract class for Enemy. Each enemy will have a number of health points and a method to take damage.
- Create some subclasses of Enemy (Troll, Orc).
- Create an interface IWeapon which has a method attack
- Create classes which implement the IWeapon interface, e.g. Sword, Club, Axe.
- Each of these could have a different damage value, which affects the health of the enemy attacked.
- Create an abstract subclass of Player called Fighter. This should have an IWeapon and an attack method.
- Create some subclasses of Fighter - Barbarian, Dwarf, Knight.
- Each will have a weapon of type IWeapon, which they can change as the game goes on i.e. a Dwarf might swap an Axe for a Club.
- Add methods, properties specific to each
- Create an interface ISpell which has a method cast
- Create classes which implement the ISpell interface
- Each of these could have a different power value, which affects the health of the enemy they are cast upon.
- Create an interface IDefend which has a method defend
- Create classes which implement the IDefend interface e.g. Ogre, Dragon
- Each should have a defend method which affects the health value of the enemy they attack.
- Create an abstract subclass of Player called Mage. This should have an IDefend and a method called defend.
- Create subclasses of Mage, e.g. Warlock and Wizard
- Each will have a spell of type ISpell and a defender of type IDefend, which they can change as the game goes on.
- Warlock and Wizard should have IDefend instead of IWeapon.
- Create an interface IHeal which has a single method Heal
- Create classes which implement the IHeal interface e.g. Potion, Herbs etc.
- Create a Cleric class. This class will have an IHeal with which they can heal other players. This can be changed as the game goes on.

#### Extensions
- Create a class for Room.
- Create an Enum called Exit, this should have 4 values (WEST, EAST, NORTH, SOUTH)
- Room should have an array of exits which should create a random number of unique exit locations when initialised.
- [x] When a user chooses an exit it should take them to a new Room.
- Create a class for Quest. This should have an array of Rooms to work through.
- Quest should complete when the array of rooms is empty.
