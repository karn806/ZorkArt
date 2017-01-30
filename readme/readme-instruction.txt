Commands:
1. info
2. take {item}
3. drop {item}
4. use {potion-item}
5. go {direction}
    1. North
    2. South
    3. West
    4. East
6. attack with {weapon-item}
7. help
8. quit

Items:
1. Sword:
    1. Excalibur (-20HP)
    2. Lightsaber (-30HP) (can use once and break)
2. Bow and arrow: 3 uses, each use decrease 10 HP.
3. Revive potion:
    1. Normal potion (+10HP)
    2. Golden Potion (+20HP)
    3. Platinum Potion (MAX HP)

io.muic.ooc.Monsters.Monster:
There are 3 ranks of monsters.
1. 'Monmon' - monster rank 1 (10HP). Drop normal potion. and sometimes Excalibur.
2. 'Minor Mon' - monster rank 2 (20HP). Drop Normal and GOlden potion. Drop Excalibur and rarely Lightsaber.
3. 'King Mon' - monster rank 3 (30HP). Drop all types of potion. and Lightsaber.

Play's Properties:
1. HP - Health Point
2. EXP - Experience Point

Constraints
A player is given Wooden Sword at first (-10HP)
A player can only hold a maximum number of 3 items.
A player have maximum Health Point (HP) of 100 points.
A monster is killed, you gain Experience by 0.1, so your attack will be more powerful by 1.1 times (rounded to closest integer).