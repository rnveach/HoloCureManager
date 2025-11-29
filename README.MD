HoloCure Manager

## What is this?

HoloCure Manager is a tool to help manage the save file for the game HoloCure. It supports reading and updating the save file. It tries to ensure updates made are strictly targeted and to leave the rest of the data alone as much as possible.

## Notice

HoloCure Manager tries its best to support save files for another game, however, mistakes and problems can always occur. It is best to back up your save file before attempting to manipulate it with this tool.

## Building from Source

You will need JDK 11+ to compile the source.

Build the all JAR using the command:

`mvn package`

Then run the CLI using the command:

`java -jar HoloCureManagerCli-X.X.X-SNAPSHOT-all.jar`

Note: Replace `X.X.X` with the current version number of the JAR.

## Commands

```
Usage: HoloCureManagerCli [-hV] [-f=PATH] [COMMAND]
HoloCure Manager
  -f, --file=PATH   The path to the save file to manage.
  -h, --help        Show this help message and exit.
  -V, --version     Print version information and exit.
Commands:
  dump, --dump, -d      Perform a full dump of the save file.
  write, --write, -w    Write the provided input stream or provided data to the
                          save file.
  list, --list, -l      List known data from the save file.
  update, --update, -u  Update only portions of a save file.
```

Note: Specifying the file path is optional unless the path cannot be determined automatically. The tool tries to read the file from `%LOCALAPPDATA%\HoloCure\save_n.dat`.

### Dump Command

```
Usage: HoloCureManagerCli dump [-hp] [COMMAND]
Perform a full dump of the save file.
      [COMMAND]   The COMMAND to display the usage help message for.
  -h, --help      Show usage help for the help command and exit.
  -p, --pretty    Pretty print the dump display.
```

### List Command

```
Usage: HoloCureManagerCli list
```

### Update Command

```
Usage: HoloCureManagerCli update [-h] [--timeModeUnlocked]
                                 [--unlockAllFurnitures] [--unlockAllItems]
                                 [--unlockAllOutfits] [--unlockAllStages]
                                 [--unlockAllWeapons] [--activeAxe=<activeAxe>]
                                 [--activeFishRod=<activeFishRod>]
                                 [--activePet=<activePet>]
                                 [--activePickaxe=<activePickaxe>]
                                 [--activeTrail=<activeTrail>]
                                 [--atkUp=<atkUp>] [--collabBan=<collabBan>]
                                 [--critUp=<critUp>] [--customize=<customize>]
                                 [--defenseUp=<defenseUp>]
                                 [--eliminate=<eliminate>]
                                 [--enchantments=<enchantments>]
                                 [--enhancementRateUp=<enhancementRateUp>]
                                 [--expGainUp=<expGainUp>] [--fandom=<fandom>]
                                 [--fanLetters=<fanLetters>]
                                 [--foodDropsUp=<foodDropsUp>]
                                 [--gRankOff=<gRankOff>] [--growth=<growth>]
                                 [--hardcore=<hardcore>] [--hasteUp=<hasteUp>]
                                 [--holdFind=<holdFind>]
                                 [--holoCoins=<holoCoins>]
                                 [--itemLimit=<itemLimit>]
                                 [--managementExp=<managementExp>]
                                 [--managementLevel=<managementLevel>]
                                 [--marketing=<marketing>]
                                 [--materialFind=<materialFind>]
                                 [--maxHpUp=<maxHpUp>] [--mineExp=<mineExp>]
                                 [--mineLevel=<mineLevel>]
                                 [--moneyGainUp=<moneyGainUp>]
                                 [--pickUpRange=<pickUpRange>]
                                 [--refundAll=<refundAll>]
                                 [--regeneration=<regeneration>]
                                 [--reroll=<reroll>] [--sand=<sand>]
                                 [--skillUp=<skillUp>] [--spdUp=<spdUp>]
                                 [--specialAttack=<specialAttack>]
                                 [--specialCooldownReduction=<specialCooldownRed
                                 uction>] [--stamps=<stamps>]
                                 [--supersBan=<supersBan>]
                                 [--supports=<supports>]
                                 [--usaChips=<usaChips>]
                                 [--weaponLimit=<weaponLimit>]
                                 [--woodcuttingExp=<woodcuttingExp>]
                                 [--woodcuttingLevel=<woodcuttingLevel>]
                                 [--addUnlockedFurniture
                                 [=<unlockFurnituresToAdd>...]]...
                                 [--addUnlockedItem[=<unlockItemsToAdd>...]]...
                                 [--addUnlockedOutfit
                                 [=<unlockOutfitsToAdd>...]]...
                                 [--addUnlockedStage
                                 [=<unlockStagesToAdd>...]]...
                                 [--addUnlockedWeapon
                                 [=<unlockWeaponsToAdd>...]]...
                                 [--removeUnlockedFurniture
                                 [=<unlockFurnituresToRemove>...]]...
                                 [--removeUnlockedItem
                                 [=<unlockItemsToRemove>...]]...
                                 [--removeUnlockedOutfit
                                 [=<unlockOutfitsToRemove>...]]...
                                 [--removeUnlockedStage
                                 [=<unlockStagesToRemove>...]]...
                                 [--removeUnlockedWeapon
                                 [=<unlockWeaponsToRemove>...]]... [COMMAND]
Update only portions of a save file.
      --activeAxe=<activeAxe>
                            Update Active Axe. Valid values are: OLD, STONE,
                              LEAD, MYTH, PROMISE, ADVENT, JUSTICE, HOLOLITE.
      --activeFishRod=<activeFishRod>
                            Update Active Fish Rod. Valid values are:
                              BEGINNERS, DADS, BLACKSMITH_MADE, ATLANTEAN,
                              TURKEY, GOLDEN.
      --activePet=<activePet>
                            Update Active Pet. Valid values are: CAT, DOG,
                              RABBIT, BEETLE, PENGUIN, MONKEY.
      --activePickaxe=<activePickaxe>
                            Update Active Pickaxe. Valid values are: OLD,
                              STONE, LEAD, MYTH, PROMISE, ADVENT, JUSTICE,
                              HOLOLITE.
      --activeTrail=<activeTrail>
                            Update Active Trail. Valid values are: HEARTS,
                              SAKURA, SPARKLES, LEAVES, HOLOLIVE, BUBBLES,
                              SKULLS.
      --addUnlockedFurniture[=<unlockFurnituresToAdd>...]
                            Unlocked Furniture(s) to add. Does nothing if
                              furniture is already unlocked. Valid values are:
                              WOODEN_BED, WOODEN_BED_B, WOODEN_BED_C,
                              WOODEN_BED_D, MARBLE_BED, FUTON, COUCH_A,
                              FOXBURGER, NIGHTSTAND_A, NIGHTSTAND_B,
                              WOODEN_DRESSER_A, WOODEN_DESK, WOODEN_PC_DESK,
                              MARBLE_DESK, MARBLE_LAPTOP_DESK, BEANBAG,
                              OFFICE_CHAIR, GAMER_CHAIR_A, GAMER_CHAIR_B,
                              GAMER_CHAIR_C, GAMER_CHAIR_D, GAMER_CHAIR_E,
                              GAMER_CHAIR_F, GAMER_CHAIR_G, GAMER_CHAIR_H,
                              VANITY, BODY_PILLOW, WOODEN_DINING_TABLE,
                              MARBLE_TABLE, WOODEN_DINING_CHAIR, MARBLE_CHAIR,
                              STOOL_A1, WOODEN_TABLE, MARBLE_TABLE_2,
                              GLASS_TABLE, EASTERN_TABLE, FLOOR_CUSHION,
                              WOODEN_TALL_CABINET, STANDING_LAMP_A, FIREPLACE,
                              TV_STAND, CRT_TV, RETRO_CONSOLE, VR_SET,
                              WOODEN_BOOKSHELF, MARBLE_BOOKSHELF, DISPLAY_CASE,
                              KITCHEN_COUNTER_A, MICROWAVE, MARBLE_COUNTER,
                              SINK, MARBLE_SINK, FRIDGE, STOVE, WOODEN_CRATE,
                              WOODEN_BARREL, BOX_A, BOX_B, TREASURE_CHEST_A,
                              PLANT_POT_A, PLANT_POT_B, PLANT_POT_C,
                              BERRY_PLANT, MARBLE_STUMP, DUMBELL,
                              EXERCISE_BALL, BOXING_DUMMY, VAMPIRE_COFFIN,
                              BAEGEMITE, TAIKO_DRUMS, SHRINE_BOX, KFP_BUCKET,
                              SHARK_PLUSH, NEKO_PLUSH, ACHAN_DOLL,
                              WOODEN_DIVIDER, MARBLE_PARTITION,
                              EASTERN_DIVIDER, WOODEN_WALL, WOODEN_WALL_2,
                              WOODEN_HALF_WALL, WOODEN_COLUMN, MARBLE_COLUMN,
                              WOODEN_DOOR, BATH_STOOL, BATHTUB, TOILET,
                              WASHING_MACHINE, LAUNDRY_BASKET, CLOCK,
                              KRONIC_CLOCK, PAINTING_A, PAINTING_C, PAINTING_B,
                              PAINTING_D, WALL_MIRROR, LANTERN, HANGING_VINE,
                              MOUNTED_SWORD, DEMON_SWORD, WINDOW, WOODEN_FLOOR,
                              WOODEN_FLOOR_2, STONE_FLOOR, RED_CARPET_FLOOR,
                              BLUE_CARPET_FLOOR, PINK_CARPET_FLOOR,
                              CONCRETE_FLOOR, MARBLE_FLOOR, TILED_FLOOR,
                              TATAMI_FLOOR, FLAT_WALL, STRIPED_WALL, SKY_WALL,
                              POLKA_WALL_A, POLKA_WALL_B, POLKA_WALL_C,
                              OCEAN_WALL, MODERN_WALL, STONE_WALL, EASTERN_WALL.
      --addUnlockedItem[=<unlockItemsToAdd>...]
                            Unlocked Item(s) to add. Does nothing if item is
                              already unlocked. Valid values are: BODY_PILLOW,
                              FULL_MEAL, PIKI_PIKI_PIMAN, SUCCUBUS_HORN,
                              HEADPHONES, UBER_SHEEP, HOLY_MILK, SAKE,
                              FACE_MASK, CREDIT_CARD, SUPER_CHATTO_TIME,
                              IDOL_COSTUME, BLACKSMITHS_GEAR, BREASTPLATE,
                              STUDY_GLASSES, GORILLAS_PAW, HALU,
                              INJECTION_ASACOCO, MEMBERSHIP, PIGGY_BANK,
                              BANDAID, CHICKENS_FEATHER, ENERGY_DRINK,
                              GWS_PILL, PLUSHIE, DEVIL_HAT, LIMITER,
                              NINJA_HEADBAND, FOCUS_SHADES, CANDY, BEETLE,
                              SHACKLESS, HOPE_SODA, LAB_COAT, PROMISE_TIARA,
                              RAVEN_FEATHER, CORPORATION_PIN.
      --addUnlockedOutfit[=<unlockOutfitsToAdd>...]
                            Unlocked Outfit(s) to add. Does nothing if outfit
                              is already unlocked. Valid values are: DEFAULT,
                              AME_ALT1, AME_ALT2, AME_ALT3, AME_ALT4,
                              GURA_ALT1, GURA_ALT2, GURA_ALT3, GURA_ALT4,
                              CALLI_ALT1, CALLI_ALT2, CALLI_ALT3, CALLI_ALT4,
                              INA_ALT1, INA_ALT2, INA_ALT3, INA_ALT4,
                              KIARA_ALT1, KIARA_ALT2, KIARA_ALT3, KIARA_ALT4,
                              IRYS_ALT1, IRYS_ALT2, IRYS_ALT3, IRYS_ALT4,
                              BAE_ALT1, BAE_ALT2, BAE_ALT3, KRONII_ALT1,
                              KRONII_ALT2, KRONII_ALT3, FAUNA_ALT1, FAUNA_ALT2,
                              FAUNA_ALT3, MUMEI_ALT1, MUMEI_ALT2, MUMEI_ALT3,
                              SANA_ALT1, SANA_ALT2, KUROKAMI, FUBUKI_ALT1,
                              FUBUKI_ALT2, FUBUKI_ALT3, OKAYU_ALT1, OKAYU_ALT2,
                              OKAYU_ALT3, KORONE_ALT1, KORONE_ALT2,
                              KORONE_ALT3, MIO_ALT1, MIO_ALT2, MIO_ALT3,
                              SORA_ALT1, SORA_ALT2, SORA_ALT3, AZKI_ALT1,
                              AZKI_ALT2, AZKI_ALT3, MIKO_ALT1, MIKO_ALT2,
                              MIKO_ALT3, SUISEI_ALT1, SUISEI_ALT2, SUISEI_ALT3,
                              ROBOCO_ALT1, ROBOCO_ALT2, ROBOCO_ALT3,
                              HAATO_ALT1, HAATO_ALT2, MEL_ALT1, MEL_ALT2,
                              MATSURI_ALT1, MATSURI_ALT2, AKI_ALT1, AKI_ALT2,
                              SUBARU_ALT1, SUBARU_ALT2, CHOCO_ALT1, CHOCO_ALT2,
                              SHION_ALT1, SHION_ALT2, AYAME_ALT1, AYAME_ALT2,
                              AQUA_ALT1, AQUA_ALT2, MOONA_ALT1, RISU_ALT1,
                              IOFI_ALT1, OLLIE_ALT1, REINE_ALT1, ANYA_ALT1,
                              KAELA_ALT1, ZETA_ALT1, KOBO_ALT1, PEKORA_ALT1,
                              NOEL_ALT1, FLARE_ALT1, MARINE_ALT1, COCO_ALT1,
                              KANATA_ALT1, WATAME_ALT1, LUNA_ALT1, TOWA_ALT1.
      --addUnlockedStage[=<unlockStagesToAdd>...]
                            Unlocked Stage(s) to add. Does nothing if stage is
                              already unlocked. Valid values are: STAGE_1,
                              STAGE_2, STAGE_3, STAGE_4, STAGE_5, STAGE_1_HARD,
                              STAGE_2_HARD, STAGE_3_HARD, STAGE_4_HARD,
                              TIME_STAGE_1, HOLO_HOUSE, USADA_CASINO.
      --addUnlockedWeapon[=<unlockWeaponsToAdd>...]
                            Unlocked Weapon(s) to add. Does nothing if weapon
                              is already unlocked. Valid values are:
                              PSYCHO_AXE, GLOWSTICK, SPIDER_COOKING, TAILPLUG,
                              BL_BOOK, ELITE_LAVA, HOLO_BOMB, HOLO_LASER,
                              WAMY_WATER, CEO_TEARS, CUTTING_BOARD,
                              BOUNCE_BALL, EN_CURSE, IDOL_SONG, X_POTATO,
                              SAUSAGE, OWL_DAGGER.
      --atkUp=<atkUp>       Update ATK Up.
      --collabBan=<collabBan>
                            Update Collab Ban.
      --critUp=<critUp>     Update Crit Up.
      --customize=<customize>
                            Update Customize.
      --defenseUp=<defenseUp>
                            Update Defense Up.
      --eliminate=<eliminate>
                            Update Eliminate.
      --enchantments=<enchantments>
                            Update Enchantments.
      --enhancementRateUp=<enhancementRateUp>
                            Update Enhancement Rate Up.
      --expGainUp=<expGainUp>
                            Update EXP Gain Up.
      --fandom=<fandom>     Update Fandom.
      --fanLetters=<fanLetters>
                            Update Fan Letters.
      --foodDropsUp=<foodDropsUp>
                            Update Food Drops Up.
      --gRankOff=<gRankOff> Update G Rank Off.
      --growth=<growth>     Update Growth.
  -h, --help
      --hardcore=<hardcore> Update Hardcore.
      --hasteUp=<hasteUp>   Update Haste Up.
      --holdFind=<holdFind> Update Hold Find.
      --holoCoins=<holoCoins>
                            Update HoloCoins.
      --itemLimit=<itemLimit>
                            Update Item Limit.
      --managementExp=<managementExp>
                            Update Management Exp.
      --managementLevel=<managementLevel>
                            Update Management Level.
      --marketing=<marketing>
                            Update Marketing.
      --materialFind=<materialFind>
                            Update Material Find.
      --maxHpUp=<maxHpUp>   Update Max HP Up.
      --mineExp=<mineExp>   Update Mine Exp.
      --mineLevel=<mineLevel>
                            Update Mine Level.
      --moneyGainUp=<moneyGainUp>
                            Update Money Gain Up.
      --pickUpRange=<pickUpRange>
                            Update Pick Up Range.
      --refundAll=<refundAll>
                            Update Refund All.
      --regeneration=<regeneration>
                            Update Regeneration.
      --removeUnlockedFurniture[=<unlockFurnituresToRemove>...]
                            Unlocked Furniture(s) to remove. Does nothing if
                              furniture isn't unlocked. Valid values are:
                              WOODEN_BED, WOODEN_BED_B, WOODEN_BED_C,
                              WOODEN_BED_D, MARBLE_BED, FUTON, COUCH_A,
                              FOXBURGER, NIGHTSTAND_A, NIGHTSTAND_B,
                              WOODEN_DRESSER_A, WOODEN_DESK, WOODEN_PC_DESK,
                              MARBLE_DESK, MARBLE_LAPTOP_DESK, BEANBAG,
                              OFFICE_CHAIR, GAMER_CHAIR_A, GAMER_CHAIR_B,
                              GAMER_CHAIR_C, GAMER_CHAIR_D, GAMER_CHAIR_E,
                              GAMER_CHAIR_F, GAMER_CHAIR_G, GAMER_CHAIR_H,
                              VANITY, BODY_PILLOW, WOODEN_DINING_TABLE,
                              MARBLE_TABLE, WOODEN_DINING_CHAIR, MARBLE_CHAIR,
                              STOOL_A1, WOODEN_TABLE, MARBLE_TABLE_2,
                              GLASS_TABLE, EASTERN_TABLE, FLOOR_CUSHION,
                              WOODEN_TALL_CABINET, STANDING_LAMP_A, FIREPLACE,
                              TV_STAND, CRT_TV, RETRO_CONSOLE, VR_SET,
                              WOODEN_BOOKSHELF, MARBLE_BOOKSHELF, DISPLAY_CASE,
                              KITCHEN_COUNTER_A, MICROWAVE, MARBLE_COUNTER,
                              SINK, MARBLE_SINK, FRIDGE, STOVE, WOODEN_CRATE,
                              WOODEN_BARREL, BOX_A, BOX_B, TREASURE_CHEST_A,
                              PLANT_POT_A, PLANT_POT_B, PLANT_POT_C,
                              BERRY_PLANT, MARBLE_STUMP, DUMBELL,
                              EXERCISE_BALL, BOXING_DUMMY, VAMPIRE_COFFIN,
                              BAEGEMITE, TAIKO_DRUMS, SHRINE_BOX, KFP_BUCKET,
                              SHARK_PLUSH, NEKO_PLUSH, ACHAN_DOLL,
                              WOODEN_DIVIDER, MARBLE_PARTITION,
                              EASTERN_DIVIDER, WOODEN_WALL, WOODEN_WALL_2,
                              WOODEN_HALF_WALL, WOODEN_COLUMN, MARBLE_COLUMN,
                              WOODEN_DOOR, BATH_STOOL, BATHTUB, TOILET,
                              WASHING_MACHINE, LAUNDRY_BASKET, CLOCK,
                              KRONIC_CLOCK, PAINTING_A, PAINTING_C, PAINTING_B,
                              PAINTING_D, WALL_MIRROR, LANTERN, HANGING_VINE,
                              MOUNTED_SWORD, DEMON_SWORD, WINDOW, WOODEN_FLOOR,
                              WOODEN_FLOOR_2, STONE_FLOOR, RED_CARPET_FLOOR,
                              BLUE_CARPET_FLOOR, PINK_CARPET_FLOOR,
                              CONCRETE_FLOOR, MARBLE_FLOOR, TILED_FLOOR,
                              TATAMI_FLOOR, FLAT_WALL, STRIPED_WALL, SKY_WALL,
                              POLKA_WALL_A, POLKA_WALL_B, POLKA_WALL_C,
                              OCEAN_WALL, MODERN_WALL, STONE_WALL, EASTERN_WALL.
      --removeUnlockedItem[=<unlockItemsToRemove>...]
                            Unlocked Item(s) to remove. Does nothing if item
                              isn't unlocked. Valid values are: BODY_PILLOW,
                              FULL_MEAL, PIKI_PIKI_PIMAN, SUCCUBUS_HORN,
                              HEADPHONES, UBER_SHEEP, HOLY_MILK, SAKE,
                              FACE_MASK, CREDIT_CARD, SUPER_CHATTO_TIME,
                              IDOL_COSTUME, BLACKSMITHS_GEAR, BREASTPLATE,
                              STUDY_GLASSES, GORILLAS_PAW, HALU,
                              INJECTION_ASACOCO, MEMBERSHIP, PIGGY_BANK,
                              BANDAID, CHICKENS_FEATHER, ENERGY_DRINK,
                              GWS_PILL, PLUSHIE, DEVIL_HAT, LIMITER,
                              NINJA_HEADBAND, FOCUS_SHADES, CANDY, BEETLE,
                              SHACKLESS, HOPE_SODA, LAB_COAT, PROMISE_TIARA,
                              RAVEN_FEATHER, CORPORATION_PIN.
      --removeUnlockedOutfit[=<unlockOutfitsToRemove>...]
                            Unlocked Outfit(s) to remove. Does nothing if
                              outfit isn't unlocked. Valid values are: DEFAULT,
                              AME_ALT1, AME_ALT2, AME_ALT3, AME_ALT4,
                              GURA_ALT1, GURA_ALT2, GURA_ALT3, GURA_ALT4,
                              CALLI_ALT1, CALLI_ALT2, CALLI_ALT3, CALLI_ALT4,
                              INA_ALT1, INA_ALT2, INA_ALT3, INA_ALT4,
                              KIARA_ALT1, KIARA_ALT2, KIARA_ALT3, KIARA_ALT4,
                              IRYS_ALT1, IRYS_ALT2, IRYS_ALT3, IRYS_ALT4,
                              BAE_ALT1, BAE_ALT2, BAE_ALT3, KRONII_ALT1,
                              KRONII_ALT2, KRONII_ALT3, FAUNA_ALT1, FAUNA_ALT2,
                              FAUNA_ALT3, MUMEI_ALT1, MUMEI_ALT2, MUMEI_ALT3,
                              SANA_ALT1, SANA_ALT2, KUROKAMI, FUBUKI_ALT1,
                              FUBUKI_ALT2, FUBUKI_ALT3, OKAYU_ALT1, OKAYU_ALT2,
                              OKAYU_ALT3, KORONE_ALT1, KORONE_ALT2,
                              KORONE_ALT3, MIO_ALT1, MIO_ALT2, MIO_ALT3,
                              SORA_ALT1, SORA_ALT2, SORA_ALT3, AZKI_ALT1,
                              AZKI_ALT2, AZKI_ALT3, MIKO_ALT1, MIKO_ALT2,
                              MIKO_ALT3, SUISEI_ALT1, SUISEI_ALT2, SUISEI_ALT3,
                              ROBOCO_ALT1, ROBOCO_ALT2, ROBOCO_ALT3,
                              HAATO_ALT1, HAATO_ALT2, MEL_ALT1, MEL_ALT2,
                              MATSURI_ALT1, MATSURI_ALT2, AKI_ALT1, AKI_ALT2,
                              SUBARU_ALT1, SUBARU_ALT2, CHOCO_ALT1, CHOCO_ALT2,
                              SHION_ALT1, SHION_ALT2, AYAME_ALT1, AYAME_ALT2,
                              AQUA_ALT1, AQUA_ALT2, MOONA_ALT1, RISU_ALT1,
                              IOFI_ALT1, OLLIE_ALT1, REINE_ALT1, ANYA_ALT1,
                              KAELA_ALT1, ZETA_ALT1, KOBO_ALT1, PEKORA_ALT1,
                              NOEL_ALT1, FLARE_ALT1, MARINE_ALT1, COCO_ALT1,
                              KANATA_ALT1, WATAME_ALT1, LUNA_ALT1, TOWA_ALT1.
      --removeUnlockedStage[=<unlockStagesToRemove>...]
                            Unlocked Stage(s) to remove. Does nothing if stage
                              isn't unlocked. Valid values are: STAGE_1,
                              STAGE_2, STAGE_3, STAGE_4, STAGE_5, STAGE_1_HARD,
                              STAGE_2_HARD, STAGE_3_HARD, STAGE_4_HARD,
                              TIME_STAGE_1, HOLO_HOUSE, USADA_CASINO.
      --removeUnlockedWeapon[=<unlockWeaponsToRemove>...]
                            Unlocked Weapon(s) to remove. Does nothing if
                              weapon isn't unlocked. Valid values are:
                              PSYCHO_AXE, GLOWSTICK, SPIDER_COOKING, TAILPLUG,
                              BL_BOOK, ELITE_LAVA, HOLO_BOMB, HOLO_LASER,
                              WAMY_WATER, CEO_TEARS, CUTTING_BOARD,
                              BOUNCE_BALL, EN_CURSE, IDOL_SONG, X_POTATO,
                              SAUSAGE, OWL_DAGGER.
      --reroll=<reroll>     Update Reroll.
      --sand=<sand>         Update Sand.
      --skillUp=<skillUp>   Update Skill Up.
      --spdUp=<spdUp>       Update SPD Up.
      --specialAttack=<specialAttack>
                            Update Special Attack.
      --specialCooldownReduction=<specialCooldownReduction>
                            Update Special Cooldown Reduction.
      --stamps=<stamps>     Update Stamps.
      --supersBan=<supersBan>
                            Update Supers Ban.
      --supports=<supports> Update Supports.
      --timeModeUnlocked    Update if Time Mode is Unlocked.
      --unlockAllFurnitures Unlock all known Furnitures.
      --unlockAllItems      Unlock all known Items.
      --unlockAllOutfits    Unlock all known Outfits.
      --unlockAllStages     Unlock all known Stages.
      --unlockAllWeapons    Unlock all known Weapons.
      --usaChips=<usaChips> Update UsaChips.
      --weaponLimit=<weaponLimit>
                            Update Weapon Limit.
      --woodcuttingExp=<woodcuttingExp>
                            Update Woodcutting Exp.
      --woodcuttingLevel=<woodcuttingLevel>
                            Update Woodcutting Level.
Commands:
  raw, --raw, -r  Update raw portions of a save file directly.
```

Note: At least one item is required to update the file with. Multiple updates can be done at a time.

### Update Raw Command

```
Usage: HoloCureManagerCli update raw [-h] -k=<key> -t=<type> -v=<value>
Update raw portions of a save file directly.
  -h, --help
  -k, --key=<key>
  -t, --type=<type>     Supported types are boolean, double, string, and json.
  -v, --value=<value>
```

Note: This replaces the update command and only 1 update can be made at a time with this method.

Note 2: This command accepts what you provide it at face value. Be careful in using this command. It should only be used if you know what you are doing.

## Future

* Provide a release.
* Expand the number of save data elements which are supported.
* Provide GUI support.
