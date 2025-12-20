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

*Note*: Replace `X.X.X` with the current version number of the JAR.

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

*Note*: Specifying the file path is optional unless the path cannot be determined automatically. The tool tries to read the file from `%LOCALAPPDATA%\HoloCure\save_n.dat`.

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
Usage: HoloCureManagerCli update [-h] [--removeAllAchievements]
                                 [--removeAllActiveMiscUnlocks]
                                 [--removeAllActiveScams]
                                 [--removeAllFandomExperiences]
                                 [--removeAllFanLetters]
                                 [--removeAllGatchaRanks]
                                 [--removeAllInventory]
                                 [--removeAllSeenCollaborations]
                                 [--removeAllTears]
                                 [--removeAllUnlockFurnitures]
                                 [--removeAllUnlockItems]
                                 [--removeAllUnlockOutfits]
                                 [--removeAllUnlockStages]
                                 [--removeAllUnlockWeapons]
                                 [--timeModeUnlocked] [--unlockAllAchievements]
                                 [--unlockAllFanLetters]
                                 [--unlockAllFurnitures] [--unlockAllItems]
                                 [--unlockAllMiscUnlocks] [--unlockAllOutfits]
                                 [--unlockAllScams]
                                 [--unlockAllSeenCollaborations]
                                 [--unlockAllStages] [--unlockAllWeapons]
                                 [--activeAxe=<activeAxe>]
                                 [--activeFishRod=<activeFishRod>]
                                 [--activePet=<activePet>]
                                 [--activePickaxe=<activePickaxe>]
                                 [--activePrism=<activePrism>]
                                 [--activeTrail=<activeTrail>]
                                 [--atkUp=<atkUp>] [--collabBan=<collabBan>]
                                 [--critUp=<critUp>] [--customize=<customize>]
                                 [--defenseUp=<defenseUp>]
                                 [--eliminate=<eliminate>]
                                 [--enchantments=<enchantments>]
                                 [--enhancementRateUp=<enhancementRateUp>]
                                 [--expGainUp=<expGainUp>] [--fandom=<fandom>]
                                 [--fanLettersUnlocked=<fanLettersUnlocked>]
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
                                 [--usadaDrinks=<usadaDrinks>]
                                 [--weaponLimit=<weaponLimit>]
                                 [--woodcuttingExp=<woodcuttingExp>]
                                 [--woodcuttingLevel=<woodcuttingLevel>]
                                 [--addAchievement[=<achievementsToAdd>...]]...
                                 [--addActiveScam[=<activeScamToAdd>...]]...
                                 [--addFandomExperience
                                 [=<fandomExperiencesToAdd>...]]...
                                 [--addGatchaRank[=<gatchaRanksToAdd>...]]...
                                 [--addInventory[=<inventoriesToAdd>...]]...
                                 [--addMiscUnlock[=<miscUnlockToAdd>...]]...
                                 [--addSeenCollaboration
                                 [=<seenCollaborationToAdd>...]]... [--addTear
                                 [=<tearsToAdd>...]]... [--addUnlockedFanLetter
                                 [=<fanLettersToAdd>...]]...
                                 [--addUnlockedFurniture
                                 [=<unlockFurnituresToAdd>...]]...
                                 [--addUnlockedItem[=<unlockItemsToAdd>...]]...
                                 [--addUnlockedOutfit
                                 [=<unlockOutfitsToAdd>...]]...
                                 [--addUnlockedStage
                                 [=<unlockStagesToAdd>...]]...
                                 [--addUnlockedWeapon
                                 [=<unlockWeaponsToAdd>...]]...
                                 [--removeAchievements
                                 [=<achievementsToRemove>...]]...
                                 [--removeActiveScam
                                 [=<activeScamToRemove>...]]...
                                 [--removeFandomExperience
                                 [=<fandomExperienceToRemove>...]]...
                                 [--removeGatchaRank
                                 [=<gatchaRanksToRemove>...]]...
                                 [--removeInventory
                                 [=<inventoriesToRemove>...]]...
                                 [--removeMiscUnlock
                                 [=<miscUnlockToRemove>...]]...
                                 [--removeSeenCollaboration
                                 [=<seenCollaborationToRemove>...]]...
                                 [--removeTear[=<tearsToRemove>...]]...
                                 [--removeUnlockedFanLetter
                                 [=<fanLettersToRemove>...]]...
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
                               LEAD, IRON, MYTH, PROMISE, ADVENT, JUSTICE,
                               HOLOLITE.
      --activeFishRod=<activeFishRod>
                             Update Active Fish Rod. Valid values are:
                               BEGINNERS, DADS, BLACKSMITH_MADE, ATLANTEAN,
                               TURKEY, GOLDEN.
      --activePet=<activePet>
                             Update Active Pet. Valid values are: CAT, DOG,
                               RABBIT, BEETLE, PENGUIN, MONKEY.
      --activePickaxe=<activePickaxe>
                             Update Active Pickaxe. Valid values are: OLD,
                               STONE, LEAD, IRON, MYTH, PROMISE, ADVENT,
                               JUSTICE, HOLOLITE.
      --activePrism=<activePrism>
                             Update Active Prism. Valid values are: BASIC,
                               MYTH, PROMISE, ADVENT, JUSTICE, HOLOLITE.
      --activeTrail=<activeTrail>
                             Update Active Trail. Valid values are: HEARTS,
                               SAKURA, SPARKLES, LEAVES, HOLOLIVE, BUBBLES,
                               SKULLS.
      --addAchievement[=<achievementsToAdd>...]
                             Achievements to add. Does nothing if achievement
                               is already unlocked. Valid values are:
                               THANKS_FOR_THE_FISH, WENT_TOO_HALU, DONT_TOUCH,
                               BUYING_POWER, TRUE_RISUNER, TRUE_BRATS, OBISA,
                               AJIMARU_AJIMARU, ITS_HAMMER_TIME, TRUE_SAPLING,
                               TANK_CLASS, MOGU_MOGU_OKAYU, SANA_IS_ETERNAL,
                               HAI, OTSUKERIS, I_FORGOR, TRUE_ZOMRADE,
                               KIKKERIKI, YODAYO, ATTENTION_PLEASE,
                               MOON_MOON_MOONAFIC_DAYO, CUTE_TODAY_TOO,
                               MY_CUTE_STUDENTS, OTSUCRAZY, TRUE_MOONAFIC,
                               WELCOME_HOME, SKILL_ISSUE, BOING, TRUE_MERAKYAT,
                               I_DONT_NEED_IT, OTSULEMAO, TRUE_KOBOKER,
                               FULL_COLLAB, GWAK, TRUE_MELFRIEND, ZETAMIN,
                               TRUE_SANALLITE, TRUE_MATSURISU, TRUE_KAPUMIN,
                               DIG_IN, KON_KON_KITSUNE, TRUE_PIONEER, HEY_GUYS,
                               NEEEEEEEEEEEEEEEEEEEEEE, GLASSES_ARE_VERSATILE,
                               MILLIONAIRE, ALONA, YOU_HAVE_BEEN_CURSED,
                               TRUE_SUKONBU, THE_REAL_GRIND, MUSCLE,
                               DECKED_OUT, PACIFIST, FIRST_WIN, EH, NYAHELLO,
                               TRUE_PEMALOE, TRUE_RNG, TRUE_IRYSTOCRAT,
                               PLENTY_OF_FISH_IN_THE_SEA, TRUE_ONIGIRIYA,
                               JUST_RNG, KUSOGAKI_POWER, RHYTHM_MASTER,
                               POWER_LEVELING, LOOK_IM_ON_TV, RAW_STRENGTH,
                               YOU_CAN_PET_THE_DOG, HOPE_HAS_DESCENDED,
                               I_LIKE_THE_COTTON_CANDY_FLAVOR, TRUE_CHUMBUD,
                               BBBBRRRRRRRREEEEEE, TWOHARD, ITS_SAFE_I_SWEAR,
                               BOOM_BOOM_BOOM, BIG_UPS, HOW_COULD_YOU,
                               BIG_RED_HEART, ALL_OUTTA_CANDY, TRUE_TAKODACHI,
                               ITS_SUPER_CHAT_TIME, THREEHARD,
                               EMPLOYEE_OF_THE_MONTH, UCHI_UCHI_UCHIDAYO,
                               TRUE_HOSHIYOMI, LOVE_NATURE, ORARARA,
                               GOTTA_CATCH_EM_ALL, ART_BLOCK, TRUE_35P,
                               GET_SOME_HELP, PURUPURU_GANBARI_RISU,
                               TRUE_KORONESUKI, HALLUCINATED,
                               THATS_NOT_DOLLRYS, TIME_TO_UPGRADE, I_DID_IT,
                               HARDCORE_GAMER, THOUSAND_MILESTONE, PAY_TO_WIN,
                               SPEED_RUNNER, KON_AZKI, I_AM_UNDER_THE_WATER,
                               FISH_FEAR_ME, INA_INA_INA, TRUE_IOFORIA,
                               YO_YO_YO, LETS_GO_GAMBLING, ZENLOSS, KON_MUSCLE,
                               SCAMMED, STAMP_HUNTER, FREE_STICKERS,
                               TRUE_WATAMATE, THIS_IS_LEGAL_RIGHT,
                               QUEEN_OF_JUMPING, OTSUKARESAMA_NANORA_NE,
                               I_AM_PEKO, FIVE_PERCENT_OF_GAMBLERS,
                               KONPEKO_KONPEKO_KONPEKO, FOURHARD, TRUE_ICHIMIN,
                               PAYDAY, TRUE_NOUSAGI, TRUE_LUKNIGHT,
                               TRUE_TATSUNOKO, LIFELONG_COMPANION,
                               ORDER_OF_OPERATIONS, NOW_FIND_THEM_ALL, KON_NUI,
                               JUST_ONE_MORE_LIFE, FIFTY_KG_GRIP, GMMF,
                               KONYAPPI, BIGGER, UCHI_UCHI_UCHIDAYO_FLARE,
                               TRUE_TOKOYAMI_KENZOKU, TRUE_HEIMIN, FASTER,
                               SET_SAIL, TRUE_DANIN_SAN, OBLITERATED, HEY_HEY,
                               FUBURA_IS_COMING, IDOL_GROUP, TRUE_HOOMAN,
                               BOOM_BOOM_BOOM_AME, TRUE_SHIOKKO, FLESH_WOUND,
                               HIGHWAY_ROBBERY, TRUE_KFPG, OVER_NINE_THOUSAND,
                               TRUE_AQUACREW, TRUE_ROSETAI, NUN_NUN,
                               POWER_OF_IDOLS, FIRED, NO_MAINS, IDOL_POWER,
                               HAMBURGER_COUNTRY_YEAH, KAPU_KAPU,
                               TRUE_CHOCOMATE, UUUUUUUUUUUUUUUUUUUUUUUUUUUU,
                               SOLO_BEATER, TRUE_NAKIRIGUMI, PAIN_PEKO,
                               TRUE_SUBATOMO, CHICKEN_DOWN, HARVEST_TIME,
                               HE_ROBO, LIMITERS_RELEASED, A_LITTLE_TROLLIN,
                               PLEASE_DONT_FAIL, DELUSIONAL, TRUE_MIOFA,
                               BULLET_HELL_PRO, THANK_YOU, IM_CEO_NOW,
                               NOT_TAKING_ANY_CHANCES, ONEHARD,
                               TEARS_OF_HAPPINESS, SORRY, FULLY_LOADED,
                               KONAQUA, TRUE_SORATOMO, TRUE_KRONIE,
                               COUCH_POTATO, LUCKY_DAY, NO_THOUGHTS_HEAD_EMPTY,
                               TRUE_DEAD_BEAT, YUBI_YUBI, TRUE_HAATON,
                               ZOMBANWA, WASSHOI_WASSHOI, WELL_TRAINED, A,
                               BAREBONES, TRUE_ZECRETARY, HIC, WAMY,
                               HE_ROBO_CLEAR.
      --addActiveScam[=<activeScamToAdd>...]
                             Active Scam(s) to add. Does nothing if scam is
                               already unlocked. Valid values are:
                               LEGENDARY_WEAPON, LEGENDARY_BOOTS,
                               LEGENDARY_GLOVES, LEGENDARY_DRINK,
                               LEGENDARY_LENS, WORKER_TOOLS, WORKER_BREAKS,
                               GOLD_RABBITS_FOOT.
      --addFandomExperience[=<fandomExperiencesToAdd>...]
                             Fandom Experience(s) to add. This will replace
                               your current fandom experience, and not add
                               them. Must be in format 'name:experience'. Valid
                               names are: NONE, EMPTY, RANDOM, AMELIA_WATSON,
                               GAWR_GURA, NINOMAE_INANIS, TAKANASHI_KIARA,
                               MORI_CALLIOPE, HAKOS_BAELZ, OURO_KRONII,
                               CERES_FAUNA, NANASHI_MUMEI, TSUKUMO_SANA, IRYS,
                               SHIRAKAMI_FUBUKI, OOKAMI_MIO, NEKOMATA_OKAYU,
                               INUGAMI_KORONE, TOKINO_SORA, AZKI, ROBOCOSAN,
                               HOSHIMACHI_SUISEI, SAKURA_MIKO, AKAI_HAATO,
                               YOZORA_MEL, NATSUIRO_MATSURI, AKI_ROSENTHAL,
                               OOZORA_SUBARU, YUZUKI_CHOCO, MURASAKI_SHION,
                               NAKIRI_AYAME, MINATO_AQUA, USADA_PEKORA,
                               HOUSHOU_MARINE, SHIROGANE_NOEL, SHIRANUI_FLARE,
                               KIRYU_COCO, AMANE_KANATA, TOKOYAMI_TOWA,
                               TSUNOMAKI_WATAME, HIMEMORI_LUNA,
                               MOONA_HOSHINOVA, AYUNDA_RISU, AIRANI_IOFIFTEEN,
                               KUREIJI_OLLIE, PAVOLIA_REINE, ANYA_MELFISSA,
                               KOBO_KANAERU, KAELA_KOVALSKIA, VESTIA_ZETA.
      --addGatchaRank[=<gatchaRanksToAdd>...]
                             Gatcha Rank(s) to add. This will replace your
                               current gatcha rank, and not add them. Must be
                               in format 'name:rank'. Valid names are: NONE,
                               EMPTY, RANDOM, AMELIA_WATSON, GAWR_GURA,
                               NINOMAE_INANIS, TAKANASHI_KIARA, MORI_CALLIOPE,
                               HAKOS_BAELZ, OURO_KRONII, CERES_FAUNA,
                               NANASHI_MUMEI, TSUKUMO_SANA, IRYS,
                               SHIRAKAMI_FUBUKI, OOKAMI_MIO, NEKOMATA_OKAYU,
                               INUGAMI_KORONE, TOKINO_SORA, AZKI, ROBOCOSAN,
                               HOSHIMACHI_SUISEI, SAKURA_MIKO, AKAI_HAATO,
                               YOZORA_MEL, NATSUIRO_MATSURI, AKI_ROSENTHAL,
                               OOZORA_SUBARU, YUZUKI_CHOCO, MURASAKI_SHION,
                               NAKIRI_AYAME, MINATO_AQUA, USADA_PEKORA,
                               HOUSHOU_MARINE, SHIROGANE_NOEL, SHIRANUI_FLARE,
                               KIRYU_COCO, AMANE_KANATA, TOKOYAMI_TOWA,
                               TSUNOMAKI_WATAME, HIMEMORI_LUNA,
                               MOONA_HOSHINOVA, AYUNDA_RISU, AIRANI_IOFIFTEEN,
                               KUREIJI_OLLIE, PAVOLIA_REINE, ANYA_MELFISSA,
                               KOBO_KANAERU, KAELA_KOVALSKIA, VESTIA_ZETA.
      --addInventory[=<inventoriesToAdd>...]
                             Inventory(s) to add. This will replace your
                               current inventory, and not add them. Must be in
                               format 'name:count:total'. Valid names are:
                               TUNA, SHRIMP, CLOWNFISH, STANDARD_SOIL,
                               EXPEDITED_SOIL, ENHANCED_SOIL, WHEAT_SEED,
                               TOMATO_SEED, POTATO_SEED, RICE_SEED, ONION_SEED,
                               CARROT_SEED, GREEN_BEANS_SEED, PEPPERS_SEED,
                               STRAWBERRY_SEED, CORN_SEED, RADISH_SEED,
                               GARLIC_SEED, TURTLE, MANTA_RAY, PUFFERFISH,
                               LOBSTER, KOI_FISH, SQUID, EEL, SHARK, STICK,
                               STONE, PLANK, LEAD_BAR, IRON_BAR, HARDWOOD,
                               MYTHRIL_BAR, CEDAR_WOOD, CARROT, RICE, ONION,
                               POTATO, WHEAT, TOMATO, ADAMANTITE_BAR,
                               MAPLE_WOOD, DIAMOND, ACACIA_WOOD, TEAK_WOOD,
                               PLATINUM_BAR, BAMBOO_WOOD, HOLOLITE.
      --addMiscUnlock[=<miscUnlockToAdd>...]
                             Misc. Unlock(s) to add. Does nothing if item is
                               already unlocked. Valid values are:
                               LEGENDARY_WEAPON, LEGENDARY_BOOTS,
                               LEGENDARY_GLOVES, LEGENDARY_DRINK,
                               LEGENDARY_LENS, TRAIL_HEARTS, TRAIL_SAKURA,
                               TRAIL_SPARKLES, TRAIL_LEAVES, TRAIL_HOLOLIVE,
                               TRAIL_BUBBLES, TRAIL_SKULLS, PET_CAT, PET_DOG,
                               PET_RABBIT, PET_BEETLE, PET_PENGUIN, PET_MONKEY,
                               WORKER_TOOLS, WORKER_BREAKS, GOLD_RABBITS_FOOT.
      --addSeenCollaboration[=<seenCollaborationToAdd>...]
                             Seen Collaboration(s) to add. Does nothing if
                               collaboration is already unlocked. Valid values
                               are: BL_FUJOSHI, BREATHE_IN_TYPE_ASACOCO,
                               BROKEN_DREAMS, ELITE_COOKING, SNOW_FLOWER_SAKE,
                               SNOW_QUEEN, DRAGON_FIRE, LIGHT_BEAM, MICOMET,
                               RING_OF_FITNESS, BONE_BROS, ABSOLUTE_WALL,
                               CURSE_BALL, ELDRITCH_HORROR, IDOL_CONCERT,
                               LEGENDARY_SAUSAGE, MIKORONE, RAP_DOG,
                               STREAM_OF_TEARS, IM_DIE_THANK_YOU_FOREVER,
                               JINGISUKAN, HOLY_FIRE, IDOL_LIVE,
                               FLATTENING_BOARD, LIGHTNING_WIENER,
                               CRESCENT_BARDICHE, BLACK_PLAGUE,
                               TRUE_INFINITE_BL_WORKS, BLOOD_LUST, FROZEN_SEA.
      --addTear[=<tearsToAdd>...]
                             Tear(s) to add. This will replace your current
                               tear, and not add them. Must be in format 'name:
                               count'. Valid names are: MYTH, COUNCIL_PROMISE,
                               GAMERS, JP_GENERATION_0, JP_GENERATION_1,
                               JP_GENERATION_2, JP_GENERATION_3,
                               JP_GENERATION_4, ID_GENERATION_1,
                               ID_GENERATION_2, ID_GENERATION_3.
      --addUnlockedFanLetter[=<fanLettersToAdd>...]
                             Fan Letter(s) to add. Does nothing if fan letter
                               is already unlocked. Valid values are: KOBOKERZ,
                               ZECRETARY, UDIN, ZOMRADE, MOONAFIC, SHIOKKO,
                               NAKIRIGUMI, FUBU_CHUN, ORUYANKE, MITEIRU,
                               KINTOKI, ROBOSA, HOSHIYOMI, MIOFA, YATAGARASU,
                               TOKOYAMI_KENZOKU, TATSUNOKO, GUY_RYS, HOOMAN,
                               BRAT, SMOL_AME, CURSED_BUBBA, SSRB, SANALITE,
                               KRONIE, KFP, HARUSAKI_NODOKA, AREA_15, HEIMIN,
                               PEMALOE, BAZO, CILUS, MERAKYAT, MELFREND,
                               RISUNER, AQUACREW, CHOCOMATE, SUBATOMO, ROSETAI,
                               KAPUMIN, A_CHAN, SUKONBU, DEADBEAT_Q, TAKODACHI,
                               SAPLING, HAATON, MATSURISU, PIONEER, SORATOMO,
                               BLOOM_GLOOM, DEADBEAT, MOONABITO, SPIDERCHAMA,
                               CHUMBUD, IOFORIA, RISCOT, WATAMATE, NOUSAGI,
                               HOUSHOU_NO_ICHIMIN, KNIGHTS_ORDER_OF_SHIROGANE,
                               ELFRIEND, OTAKU, NANORAAA, FUBURA,
                               BAE_HALLOWEEN, MIKODANYE, SHUBANGELION,
                               TEA_MATE, CHUMBUD_Q, HALLOWEEN_MYTH, OBAKE_CHAN,
                               P35, STAFF, GORIELA, PEKODAM, ONIGIRIYA,
                               KORONESUKI, UPAO, LU_KNIGHT, CHOCOLAT,
                               IRYSTOCRAT_LEGACY, POYOYO.
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
                               WOODEN_BOOKSHELF, MARBLE_BOOKSHELF,
                               DISPLAY_CASE, KITCHEN_COUNTER_A, MICROWAVE,
                               MARBLE_COUNTER, SINK, MARBLE_SINK, FRIDGE,
                               STOVE, WOODEN_CRATE, WOODEN_BARREL, BOX_A,
                               BOX_B, TREASURE_CHEST_A, PLANT_POT_A,
                               PLANT_POT_B, PLANT_POT_C, BERRY_PLANT,
                               MARBLE_STUMP, DUMBELL, EXERCISE_BALL,
                               BOXING_DUMMY, VAMPIRE_COFFIN, BAEGEMITE,
                               TAIKO_DRUMS, SHRINE_BOX, KFP_BUCKET,
                               SHARK_PLUSH, NEKO_PLUSH, ACHAN_DOLL,
                               WOODEN_DIVIDER, MARBLE_PARTITION,
                               EASTERN_DIVIDER, WOODEN_WALL, WOODEN_WALL_2,
                               WOODEN_HALF_WALL, WOODEN_COLUMN, MARBLE_COLUMN,
                               WOODEN_DOOR, BATH_STOOL, BATHTUB, TOILET,
                               WASHING_MACHINE, LAUNDRY_BASKET, CLOCK,
                               KRONIC_CLOCK, PAINTING_A, PAINTING_C,
                               PAINTING_B, PAINTING_D, WALL_MIRROR, LANTERN,
                               HANGING_VINE, MOUNTED_SWORD, DEMON_SWORD,
                               WINDOW, WOODEN_FLOOR, WOODEN_FLOOR_2,
                               STONE_FLOOR, RED_CARPET_FLOOR,
                               BLUE_CARPET_FLOOR, PINK_CARPET_FLOOR,
                               CONCRETE_FLOOR, MARBLE_FLOOR, TILED_FLOOR,
                               TATAMI_FLOOR, FLAT_WALL, STRIPED_WALL, SKY_WALL,
                               POLKA_WALL_A, POLKA_WALL_B, POLKA_WALL_C,
                               OCEAN_WALL, MODERN_WALL, STONE_WALL,
                               EASTERN_WALL.
      --addUnlockedItem[=<unlockItemsToAdd>...]
                             Unlocked Item(s) to add. Does nothing if item is
                               already unlocked. Valid values are: BODY_PILLOW,
                               FULL_MEAL, PIKI_PIKI_PIMAN, NURSES_HORN,
                               HEADPHONES, UBER_SHEEP, KNIGHTLY_MILK, SAKE,
                               FACE_MASK, CREDIT_CARD, SUPER_CHATTO_TIME,
                               IDOL_COSTUME, BLACKSMITHS_GEAR, BREASTPLATE,
                               STUDY_GLASSES, GORILLAS_PAW, HALU,
                               INJECTION_TYPE_ASACOCO, MEMBERSHIP,
                               STOLEN_PIGGY_BANK, JUST_BANDAGE,
                               CHICKENS_FEATHER, ENERGY_DRINK, GWS_PILL,
                               PLUSHIE, DEVIL_HAT, LIMITER, NINJA_HEADBAND,
                               FOCUS_SHADES, CANDY_KINGDOM_SWEETS, BEETLE,
                               KUSOGAKI_SHACKLES, HOPE_SODA, RESEARCHERS_COAT,
                               PROMISE_TIARA, RAVEN_FEATHER, CORPORATION_PIN.
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
                               KRONII_ALT2, KRONII_ALT3, FAUNA_ALT1,
                               FAUNA_ALT2, FAUNA_ALT3, MUMEI_ALT1, MUMEI_ALT2,
                               MUMEI_ALT3, SANA_ALT1, SANA_ALT2, KUROKAMI,
                               FUBUKI_ALT1, FUBUKI_ALT2, FUBUKI_ALT3,
                               OKAYU_ALT1, OKAYU_ALT2, OKAYU_ALT3, KORONE_ALT1,
                               KORONE_ALT2, KORONE_ALT3, MIO_ALT1, MIO_ALT2,
                               MIO_ALT3, SORA_ALT1, SORA_ALT2, SORA_ALT3,
                               AZKI_ALT1, AZKI_ALT2, AZKI_ALT3, MIKO_ALT1,
                               MIKO_ALT2, MIKO_ALT3, SUISEI_ALT1, SUISEI_ALT2,
                               SUISEI_ALT3, ROBOCO_ALT1, ROBOCO_ALT2,
                               ROBOCO_ALT3, HAATO_ALT1, HAATO_ALT2, MEL_ALT1,
                               MEL_ALT2, MATSURI_ALT1, MATSURI_ALT2, AKI_ALT1,
                               AKI_ALT2, SUBARU_ALT1, SUBARU_ALT2, CHOCO_ALT1,
                               CHOCO_ALT2, SHION_ALT1, SHION_ALT2, AYAME_ALT1,
                               AYAME_ALT2, AQUA_ALT1, AQUA_ALT2, MOONA_ALT1,
                               RISU_ALT1, IOFI_ALT1, OLLIE_ALT1, REINE_ALT1,
                               ANYA_ALT1, KAELA_ALT1, ZETA_ALT1, KOBO_ALT1,
                               PEKORA_ALT1, NOEL_ALT1, FLARE_ALT1, MARINE_ALT1,
                               COCO_ALT1, KANATA_ALT1, WATAME_ALT1, LUNA_ALT1,
                               TOWA_ALT1.
      --addUnlockedStage[=<unlockStagesToAdd>...]
                             Unlocked Stage(s) to add. Does nothing if stage is
                               already unlocked. Valid values are: STAGE_1,
                               STAGE_2, STAGE_3, STAGE_4, STAGE_5,
                               STAGE_1_HARD, STAGE_2_HARD, STAGE_3_HARD,
                               STAGE_4_HARD, TIME_STAGE_1, HOLO_HOUSE,
                               USADA_CASINO.
      --addUnlockedWeapon[=<unlockWeaponsToAdd>...]
                             Unlocked Weapon(s) to add. Does nothing if weapon
                               is already unlocked. Valid values are:
                               PSYCHO_AXE, GLOWSTICK, SPIDER_COOKING,
                               PLUG_TYPE_ASACOCO, BL_BOOK, ELITE_LAVA_BUCKET,
                               HOLO_BOMB, FAN_BEAM, WAMY_WATER, CEOS_TEARS,
                               CUTTING_BOARD, BOUNCE_BALL, ENS_CURSE,
                               IDOL_SONG, X_POTATO, SAUSAGE, OWL_DAGGER.
      --atkUp=<atkUp>        Update ATK Up.
      --collabBan=<collabBan>
                             Update Collab Ban.
      --critUp=<critUp>      Update Crit Up.
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
      --fandom=<fandom>      Update Fandom.
      --fanLettersUnlocked=<fanLettersUnlocked>
                             Update Fan Letters Unlocked.
      --foodDropsUp=<foodDropsUp>
                             Update Food Drops Up.
      --gRankOff=<gRankOff>  Update G Rank Off.
      --growth=<growth>      Update Growth.
  -h, --help
      --hardcore=<hardcore>  Update Hardcore.
      --hasteUp=<hasteUp>    Update Haste Up.
      --holdFind=<holdFind>  Update Hold Find.
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
      --maxHpUp=<maxHpUp>    Update Max HP Up.
      --mineExp=<mineExp>    Update Mine Exp.
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
      --removeAchievements[=<achievementsToRemove>...]
                             Achievements to remove. Does nothing if
                               achievement isn't unlocked. Valid values are:
                               THANKS_FOR_THE_FISH, WENT_TOO_HALU, DONT_TOUCH,
                               BUYING_POWER, TRUE_RISUNER, TRUE_BRATS, OBISA,
                               AJIMARU_AJIMARU, ITS_HAMMER_TIME, TRUE_SAPLING,
                               TANK_CLASS, MOGU_MOGU_OKAYU, SANA_IS_ETERNAL,
                               HAI, OTSUKERIS, I_FORGOR, TRUE_ZOMRADE,
                               KIKKERIKI, YODAYO, ATTENTION_PLEASE,
                               MOON_MOON_MOONAFIC_DAYO, CUTE_TODAY_TOO,
                               MY_CUTE_STUDENTS, OTSUCRAZY, TRUE_MOONAFIC,
                               WELCOME_HOME, SKILL_ISSUE, BOING, TRUE_MERAKYAT,
                               I_DONT_NEED_IT, OTSULEMAO, TRUE_KOBOKER,
                               FULL_COLLAB, GWAK, TRUE_MELFRIEND, ZETAMIN,
                               TRUE_SANALLITE, TRUE_MATSURISU, TRUE_KAPUMIN,
                               DIG_IN, KON_KON_KITSUNE, TRUE_PIONEER, HEY_GUYS,
                               NEEEEEEEEEEEEEEEEEEEEEE, GLASSES_ARE_VERSATILE,
                               MILLIONAIRE, ALONA, YOU_HAVE_BEEN_CURSED,
                               TRUE_SUKONBU, THE_REAL_GRIND, MUSCLE,
                               DECKED_OUT, PACIFIST, FIRST_WIN, EH, NYAHELLO,
                               TRUE_PEMALOE, TRUE_RNG, TRUE_IRYSTOCRAT,
                               PLENTY_OF_FISH_IN_THE_SEA, TRUE_ONIGIRIYA,
                               JUST_RNG, KUSOGAKI_POWER, RHYTHM_MASTER,
                               POWER_LEVELING, LOOK_IM_ON_TV, RAW_STRENGTH,
                               YOU_CAN_PET_THE_DOG, HOPE_HAS_DESCENDED,
                               I_LIKE_THE_COTTON_CANDY_FLAVOR, TRUE_CHUMBUD,
                               BBBBRRRRRRRREEEEEE, TWOHARD, ITS_SAFE_I_SWEAR,
                               BOOM_BOOM_BOOM, BIG_UPS, HOW_COULD_YOU,
                               BIG_RED_HEART, ALL_OUTTA_CANDY, TRUE_TAKODACHI,
                               ITS_SUPER_CHAT_TIME, THREEHARD,
                               EMPLOYEE_OF_THE_MONTH, UCHI_UCHI_UCHIDAYO,
                               TRUE_HOSHIYOMI, LOVE_NATURE, ORARARA,
                               GOTTA_CATCH_EM_ALL, ART_BLOCK, TRUE_35P,
                               GET_SOME_HELP, PURUPURU_GANBARI_RISU,
                               TRUE_KORONESUKI, HALLUCINATED,
                               THATS_NOT_DOLLRYS, TIME_TO_UPGRADE, I_DID_IT,
                               HARDCORE_GAMER, THOUSAND_MILESTONE, PAY_TO_WIN,
                               SPEED_RUNNER, KON_AZKI, I_AM_UNDER_THE_WATER,
                               FISH_FEAR_ME, INA_INA_INA, TRUE_IOFORIA,
                               YO_YO_YO, LETS_GO_GAMBLING, ZENLOSS, KON_MUSCLE,
                               SCAMMED, STAMP_HUNTER, FREE_STICKERS,
                               TRUE_WATAMATE, THIS_IS_LEGAL_RIGHT,
                               QUEEN_OF_JUMPING, OTSUKARESAMA_NANORA_NE,
                               I_AM_PEKO, FIVE_PERCENT_OF_GAMBLERS,
                               KONPEKO_KONPEKO_KONPEKO, FOURHARD, TRUE_ICHIMIN,
                               PAYDAY, TRUE_NOUSAGI, TRUE_LUKNIGHT,
                               TRUE_TATSUNOKO, LIFELONG_COMPANION,
                               ORDER_OF_OPERATIONS, NOW_FIND_THEM_ALL, KON_NUI,
                               JUST_ONE_MORE_LIFE, FIFTY_KG_GRIP, GMMF,
                               KONYAPPI, BIGGER, UCHI_UCHI_UCHIDAYO_FLARE,
                               TRUE_TOKOYAMI_KENZOKU, TRUE_HEIMIN, FASTER,
                               SET_SAIL, TRUE_DANIN_SAN, OBLITERATED, HEY_HEY,
                               FUBURA_IS_COMING, IDOL_GROUP, TRUE_HOOMAN,
                               BOOM_BOOM_BOOM_AME, TRUE_SHIOKKO, FLESH_WOUND,
                               HIGHWAY_ROBBERY, TRUE_KFPG, OVER_NINE_THOUSAND,
                               TRUE_AQUACREW, TRUE_ROSETAI, NUN_NUN,
                               POWER_OF_IDOLS, FIRED, NO_MAINS, IDOL_POWER,
                               HAMBURGER_COUNTRY_YEAH, KAPU_KAPU,
                               TRUE_CHOCOMATE, UUUUUUUUUUUUUUUUUUUUUUUUUUUU,
                               SOLO_BEATER, TRUE_NAKIRIGUMI, PAIN_PEKO,
                               TRUE_SUBATOMO, CHICKEN_DOWN, HARVEST_TIME,
                               HE_ROBO, LIMITERS_RELEASED, A_LITTLE_TROLLIN,
                               PLEASE_DONT_FAIL, DELUSIONAL, TRUE_MIOFA,
                               BULLET_HELL_PRO, THANK_YOU, IM_CEO_NOW,
                               NOT_TAKING_ANY_CHANCES, ONEHARD,
                               TEARS_OF_HAPPINESS, SORRY, FULLY_LOADED,
                               KONAQUA, TRUE_SORATOMO, TRUE_KRONIE,
                               COUCH_POTATO, LUCKY_DAY, NO_THOUGHTS_HEAD_EMPTY,
                               TRUE_DEAD_BEAT, YUBI_YUBI, TRUE_HAATON,
                               ZOMBANWA, WASSHOI_WASSHOI, WELL_TRAINED, A,
                               BAREBONES, TRUE_ZECRETARY, HIC, WAMY,
                               HE_ROBO_CLEAR.
      --removeActiveScam[=<activeScamToRemove>...]
                             Active Scam(s) to remove. Does nothing if scam
                               isn't unlocked. Valid values are:
                               LEGENDARY_WEAPON, LEGENDARY_BOOTS,
                               LEGENDARY_GLOVES, LEGENDARY_DRINK,
                               LEGENDARY_LENS, WORKER_TOOLS, WORKER_BREAKS,
                               GOLD_RABBITS_FOOT.
      --removeAllAchievements
                             Remove all Achievements.
      --removeAllActiveMiscUnlocks
                             Remove all Active Misc. Unlocks.
      --removeAllActiveScams Remove all Active Scams.
      --removeAllFandomExperiences
                             Remove all Fandom Experiences.
      --removeAllFanLetters  Remove all Fan Letters.
      --removeAllGatchaRanks Remove all Gatcha Ranks.
      --removeAllInventory   Remove all Inventory.
      --removeAllSeenCollaborations
                             Remove all Seen Collaborations.
      --removeAllTears       Remove all Tears.
      --removeAllUnlockFurnitures
                             Remove all Unlock Furnitures.
      --removeAllUnlockItems Remove all Unlock Items.
      --removeAllUnlockOutfits
                             Remove all Unlock Outfits.
      --removeAllUnlockStages
                             Remove all Unlock Stages.
      --removeAllUnlockWeapons
                             Remove all Unlock Weapons.
      --removeFandomExperience[=<fandomExperienceToRemove>...]
                             Fandom Experience(s) to remove. This will replace
                               your current fandom experience, and not add
                               them. Does nothing if fandom experience doesn't
                               exist. Must be in format 'name:experience'.
                               Valid names are: NONE, EMPTY, RANDOM,
                               AMELIA_WATSON, GAWR_GURA, NINOMAE_INANIS,
                               TAKANASHI_KIARA, MORI_CALLIOPE, HAKOS_BAELZ,
                               OURO_KRONII, CERES_FAUNA, NANASHI_MUMEI,
                               TSUKUMO_SANA, IRYS, SHIRAKAMI_FUBUKI,
                               OOKAMI_MIO, NEKOMATA_OKAYU, INUGAMI_KORONE,
                               TOKINO_SORA, AZKI, ROBOCOSAN, HOSHIMACHI_SUISEI,
                               SAKURA_MIKO, AKAI_HAATO, YOZORA_MEL,
                               NATSUIRO_MATSURI, AKI_ROSENTHAL, OOZORA_SUBARU,
                               YUZUKI_CHOCO, MURASAKI_SHION, NAKIRI_AYAME,
                               MINATO_AQUA, USADA_PEKORA, HOUSHOU_MARINE,
                               SHIROGANE_NOEL, SHIRANUI_FLARE, KIRYU_COCO,
                               AMANE_KANATA, TOKOYAMI_TOWA, TSUNOMAKI_WATAME,
                               HIMEMORI_LUNA, MOONA_HOSHINOVA, AYUNDA_RISU,
                               AIRANI_IOFIFTEEN, KUREIJI_OLLIE, PAVOLIA_REINE,
                               ANYA_MELFISSA, KOBO_KANAERU, KAELA_KOVALSKIA,
                               VESTIA_ZETA.
      --removeGatchaRank[=<gatchaRanksToRemove>...]
                             Gatcha Rank(s) to remove. This will replace your
                               current gatcha rank, and not add them. Does
                               nothing if gatcha rank doesn't exist. Must be in
                               format 'name:rank'. Valid names are: NONE,
                               EMPTY, RANDOM, AMELIA_WATSON, GAWR_GURA,
                               NINOMAE_INANIS, TAKANASHI_KIARA, MORI_CALLIOPE,
                               HAKOS_BAELZ, OURO_KRONII, CERES_FAUNA,
                               NANASHI_MUMEI, TSUKUMO_SANA, IRYS,
                               SHIRAKAMI_FUBUKI, OOKAMI_MIO, NEKOMATA_OKAYU,
                               INUGAMI_KORONE, TOKINO_SORA, AZKI, ROBOCOSAN,
                               HOSHIMACHI_SUISEI, SAKURA_MIKO, AKAI_HAATO,
                               YOZORA_MEL, NATSUIRO_MATSURI, AKI_ROSENTHAL,
                               OOZORA_SUBARU, YUZUKI_CHOCO, MURASAKI_SHION,
                               NAKIRI_AYAME, MINATO_AQUA, USADA_PEKORA,
                               HOUSHOU_MARINE, SHIROGANE_NOEL, SHIRANUI_FLARE,
                               KIRYU_COCO, AMANE_KANATA, TOKOYAMI_TOWA,
                               TSUNOMAKI_WATAME, HIMEMORI_LUNA,
                               MOONA_HOSHINOVA, AYUNDA_RISU, AIRANI_IOFIFTEEN,
                               KUREIJI_OLLIE, PAVOLIA_REINE, ANYA_MELFISSA,
                               KOBO_KANAERU, KAELA_KOVALSKIA, VESTIA_ZETA.
      --removeInventory[=<inventoriesToRemove>...]
                             Inventory(s) to remove. This will replace your
                               current inventory, and not add them. Does
                               nothing if inventory doesn't exist. Must be in
                               format 'name:count:total'. Valid names are: .
      --removeMiscUnlock[=<miscUnlockToRemove>...]
                             Misc. Unlock(s) to remove. Does nothing if item
                               isn't unlocked. Valid values are:
                               LEGENDARY_WEAPON, LEGENDARY_BOOTS,
                               LEGENDARY_GLOVES, LEGENDARY_DRINK,
                               LEGENDARY_LENS, TRAIL_HEARTS, TRAIL_SAKURA,
                               TRAIL_SPARKLES, TRAIL_LEAVES, TRAIL_HOLOLIVE,
                               TRAIL_BUBBLES, TRAIL_SKULLS, PET_CAT, PET_DOG,
                               PET_RABBIT, PET_BEETLE, PET_PENGUIN, PET_MONKEY,
                               WORKER_TOOLS, WORKER_BREAKS, GOLD_RABBITS_FOOT.
      --removeSeenCollaboration[=<seenCollaborationToRemove>...]
                             Seen Collaboration(s) to remove. Does nothing if
                               collaboration isn't unlocked. Valid values are:
                               BL_FUJOSHI, BREATHE_IN_TYPE_ASACOCO,
                               BROKEN_DREAMS, ELITE_COOKING, SNOW_FLOWER_SAKE,
                               SNOW_QUEEN, DRAGON_FIRE, LIGHT_BEAM, MICOMET,
                               RING_OF_FITNESS, BONE_BROS, ABSOLUTE_WALL,
                               CURSE_BALL, ELDRITCH_HORROR, IDOL_CONCERT,
                               LEGENDARY_SAUSAGE, MIKORONE, RAP_DOG,
                               STREAM_OF_TEARS, IM_DIE_THANK_YOU_FOREVER,
                               JINGISUKAN, HOLY_FIRE, IDOL_LIVE,
                               FLATTENING_BOARD, LIGHTNING_WIENER,
                               CRESCENT_BARDICHE, BLACK_PLAGUE,
                               TRUE_INFINITE_BL_WORKS, BLOOD_LUST, FROZEN_SEA.
      --removeTear[=<tearsToRemove>...]
                             Tear(s) to remove. This will replace your current
                               tear, and not add them. Does nothing if tear
                               doesn't exist. Must be in format 'name:count:
                               total'. Valid names are: MYTH, COUNCIL_PROMISE,
                               GAMERS, JP_GENERATION_0, JP_GENERATION_1,
                               JP_GENERATION_2, JP_GENERATION_3,
                               JP_GENERATION_4, ID_GENERATION_1,
                               ID_GENERATION_2, ID_GENERATION_3.
      --removeUnlockedFanLetter[=<fanLettersToRemove>...]
                             Fan Letter(s) to remove. Does nothing if fan
                               letter isn't unlocked. Valid values are:
                               KOBOKERZ, ZECRETARY, UDIN, ZOMRADE, MOONAFIC,
                               SHIOKKO, NAKIRIGUMI, FUBU_CHUN, ORUYANKE,
                               MITEIRU, KINTOKI, ROBOSA, HOSHIYOMI, MIOFA,
                               YATAGARASU, TOKOYAMI_KENZOKU, TATSUNOKO,
                               GUY_RYS, HOOMAN, BRAT, SMOL_AME, CURSED_BUBBA,
                               SSRB, SANALITE, KRONIE, KFP, HARUSAKI_NODOKA,
                               AREA_15, HEIMIN, PEMALOE, BAZO, CILUS, MERAKYAT,
                               MELFREND, RISUNER, AQUACREW, CHOCOMATE,
                               SUBATOMO, ROSETAI, KAPUMIN, A_CHAN, SUKONBU,
                               DEADBEAT_Q, TAKODACHI, SAPLING, HAATON,
                               MATSURISU, PIONEER, SORATOMO, BLOOM_GLOOM,
                               DEADBEAT, MOONABITO, SPIDERCHAMA, CHUMBUD,
                               IOFORIA, RISCOT, WATAMATE, NOUSAGI,
                               HOUSHOU_NO_ICHIMIN, KNIGHTS_ORDER_OF_SHIROGANE,
                               ELFRIEND, OTAKU, NANORAAA, FUBURA,
                               BAE_HALLOWEEN, MIKODANYE, SHUBANGELION,
                               TEA_MATE, CHUMBUD_Q, HALLOWEEN_MYTH, OBAKE_CHAN,
                               P35, STAFF, GORIELA, PEKODAM, ONIGIRIYA,
                               KORONESUKI, UPAO, LU_KNIGHT, CHOCOLAT,
                               IRYSTOCRAT_LEGACY, POYOYO.
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
                               WOODEN_BOOKSHELF, MARBLE_BOOKSHELF,
                               DISPLAY_CASE, KITCHEN_COUNTER_A, MICROWAVE,
                               MARBLE_COUNTER, SINK, MARBLE_SINK, FRIDGE,
                               STOVE, WOODEN_CRATE, WOODEN_BARREL, BOX_A,
                               BOX_B, TREASURE_CHEST_A, PLANT_POT_A,
                               PLANT_POT_B, PLANT_POT_C, BERRY_PLANT,
                               MARBLE_STUMP, DUMBELL, EXERCISE_BALL,
                               BOXING_DUMMY, VAMPIRE_COFFIN, BAEGEMITE,
                               TAIKO_DRUMS, SHRINE_BOX, KFP_BUCKET,
                               SHARK_PLUSH, NEKO_PLUSH, ACHAN_DOLL,
                               WOODEN_DIVIDER, MARBLE_PARTITION,
                               EASTERN_DIVIDER, WOODEN_WALL, WOODEN_WALL_2,
                               WOODEN_HALF_WALL, WOODEN_COLUMN, MARBLE_COLUMN,
                               WOODEN_DOOR, BATH_STOOL, BATHTUB, TOILET,
                               WASHING_MACHINE, LAUNDRY_BASKET, CLOCK,
                               KRONIC_CLOCK, PAINTING_A, PAINTING_C,
                               PAINTING_B, PAINTING_D, WALL_MIRROR, LANTERN,
                               HANGING_VINE, MOUNTED_SWORD, DEMON_SWORD,
                               WINDOW, WOODEN_FLOOR, WOODEN_FLOOR_2,
                               STONE_FLOOR, RED_CARPET_FLOOR,
                               BLUE_CARPET_FLOOR, PINK_CARPET_FLOOR,
                               CONCRETE_FLOOR, MARBLE_FLOOR, TILED_FLOOR,
                               TATAMI_FLOOR, FLAT_WALL, STRIPED_WALL, SKY_WALL,
                               POLKA_WALL_A, POLKA_WALL_B, POLKA_WALL_C,
                               OCEAN_WALL, MODERN_WALL, STONE_WALL,
                               EASTERN_WALL.
      --removeUnlockedItem[=<unlockItemsToRemove>...]
                             Unlocked Item(s) to remove. Does nothing if item
                               isn't unlocked. Valid values are: BODY_PILLOW,
                               FULL_MEAL, PIKI_PIKI_PIMAN, NURSES_HORN,
                               HEADPHONES, UBER_SHEEP, KNIGHTLY_MILK, SAKE,
                               FACE_MASK, CREDIT_CARD, SUPER_CHATTO_TIME,
                               IDOL_COSTUME, BLACKSMITHS_GEAR, BREASTPLATE,
                               STUDY_GLASSES, GORILLAS_PAW, HALU,
                               INJECTION_TYPE_ASACOCO, MEMBERSHIP,
                               STOLEN_PIGGY_BANK, JUST_BANDAGE,
                               CHICKENS_FEATHER, ENERGY_DRINK, GWS_PILL,
                               PLUSHIE, DEVIL_HAT, LIMITER, NINJA_HEADBAND,
                               FOCUS_SHADES, CANDY_KINGDOM_SWEETS, BEETLE,
                               KUSOGAKI_SHACKLES, HOPE_SODA, RESEARCHERS_COAT,
                               PROMISE_TIARA, RAVEN_FEATHER, CORPORATION_PIN.
      --removeUnlockedOutfit[=<unlockOutfitsToRemove>...]
                             Unlocked Outfit(s) to remove. Does nothing if
                               outfit isn't unlocked. Valid values are:
                               DEFAULT, AME_ALT1, AME_ALT2, AME_ALT3, AME_ALT4,
                               GURA_ALT1, GURA_ALT2, GURA_ALT3, GURA_ALT4,
                               CALLI_ALT1, CALLI_ALT2, CALLI_ALT3, CALLI_ALT4,
                               INA_ALT1, INA_ALT2, INA_ALT3, INA_ALT4,
                               KIARA_ALT1, KIARA_ALT2, KIARA_ALT3, KIARA_ALT4,
                               IRYS_ALT1, IRYS_ALT2, IRYS_ALT3, IRYS_ALT4,
                               BAE_ALT1, BAE_ALT2, BAE_ALT3, KRONII_ALT1,
                               KRONII_ALT2, KRONII_ALT3, FAUNA_ALT1,
                               FAUNA_ALT2, FAUNA_ALT3, MUMEI_ALT1, MUMEI_ALT2,
                               MUMEI_ALT3, SANA_ALT1, SANA_ALT2, KUROKAMI,
                               FUBUKI_ALT1, FUBUKI_ALT2, FUBUKI_ALT3,
                               OKAYU_ALT1, OKAYU_ALT2, OKAYU_ALT3, KORONE_ALT1,
                               KORONE_ALT2, KORONE_ALT3, MIO_ALT1, MIO_ALT2,
                               MIO_ALT3, SORA_ALT1, SORA_ALT2, SORA_ALT3,
                               AZKI_ALT1, AZKI_ALT2, AZKI_ALT3, MIKO_ALT1,
                               MIKO_ALT2, MIKO_ALT3, SUISEI_ALT1, SUISEI_ALT2,
                               SUISEI_ALT3, ROBOCO_ALT1, ROBOCO_ALT2,
                               ROBOCO_ALT3, HAATO_ALT1, HAATO_ALT2, MEL_ALT1,
                               MEL_ALT2, MATSURI_ALT1, MATSURI_ALT2, AKI_ALT1,
                               AKI_ALT2, SUBARU_ALT1, SUBARU_ALT2, CHOCO_ALT1,
                               CHOCO_ALT2, SHION_ALT1, SHION_ALT2, AYAME_ALT1,
                               AYAME_ALT2, AQUA_ALT1, AQUA_ALT2, MOONA_ALT1,
                               RISU_ALT1, IOFI_ALT1, OLLIE_ALT1, REINE_ALT1,
                               ANYA_ALT1, KAELA_ALT1, ZETA_ALT1, KOBO_ALT1,
                               PEKORA_ALT1, NOEL_ALT1, FLARE_ALT1, MARINE_ALT1,
                               COCO_ALT1, KANATA_ALT1, WATAME_ALT1, LUNA_ALT1,
                               TOWA_ALT1.
      --removeUnlockedStage[=<unlockStagesToRemove>...]
                             Unlocked Stage(s) to remove. Does nothing if stage
                               isn't unlocked. Valid values are: STAGE_1,
                               STAGE_2, STAGE_3, STAGE_4, STAGE_5,
                               STAGE_1_HARD, STAGE_2_HARD, STAGE_3_HARD,
                               STAGE_4_HARD, TIME_STAGE_1, HOLO_HOUSE,
                               USADA_CASINO.
      --removeUnlockedWeapon[=<unlockWeaponsToRemove>...]
                             Unlocked Weapon(s) to remove. Does nothing if
                               weapon isn't unlocked. Valid values are:
                               PSYCHO_AXE, GLOWSTICK, SPIDER_COOKING,
                               PLUG_TYPE_ASACOCO, BL_BOOK, ELITE_LAVA_BUCKET,
                               HOLO_BOMB, FAN_BEAM, WAMY_WATER, CEOS_TEARS,
                               CUTTING_BOARD, BOUNCE_BALL, ENS_CURSE,
                               IDOL_SONG, X_POTATO, SAUSAGE, OWL_DAGGER.
      --reroll=<reroll>      Update Reroll.
      --sand=<sand>          Update Sand.
      --skillUp=<skillUp>    Update Skill Up.
      --spdUp=<spdUp>        Update SPD Up.
      --specialAttack=<specialAttack>
                             Update Special Attack.
      --specialCooldownReduction=<specialCooldownReduction>
                             Update Special Cooldown Reduction.
      --stamps=<stamps>      Update Stamps.
      --supersBan=<supersBan>
                             Update Supers Ban.
      --supports=<supports>  Update Supports.
      --timeModeUnlocked     Update if Time Mode is Unlocked.
      --unlockAllAchievements
                             Unlock all known Achievements.
      --unlockAllFanLetters  Unlock all known Fan Letters.
      --unlockAllFurnitures  Unlock all known Furnitures.
      --unlockAllItems       Unlock all known Items.
      --unlockAllMiscUnlocks Unlock all known Misc. Unlocks.
      --unlockAllOutfits     Unlock all known Outfits.
      --unlockAllScams       Unlock all known Scams.
      --unlockAllSeenCollaborations
                             Unlock all known Seen Collaborations.
      --unlockAllStages      Unlock all known Stages.
      --unlockAllWeapons     Unlock all known Weapons.
      --usaChips=<usaChips>  Update UsaChips.
      --usadaDrinks=<usadaDrinks>
                             Update Usada Drinks.
      --weaponLimit=<weaponLimit>
                             Update Weapon Limit.
      --woodcuttingExp=<woodcuttingExp>
                             Update Woodcutting Exp.
      --woodcuttingLevel=<woodcuttingLevel>
                             Update Woodcutting Level.
Commands:
  raw, --raw, -r  Update raw portions of a save file directly.
```

*Note*: At least one item is required to update the file with. Multiple updates can be done at a time.

### Update Raw Command

```
Usage: HoloCureManagerCli update raw [-h] -k=<key> -t=<type> -v=<value>
Update raw portions of a save file directly.
  -h, --help
  -k, --key=<key>
  -t, --type=<type>     Supported types are boolean, double, string, and json.
  -v, --value=<value>
```

*Note*: This replaces the update command and only 1 update can be made at a time with this method.

*Note 2*: This command accepts what you provide it at face value. Be careful in using this command. It should only be used if you know what you are doing.

## Super Commands

Obtain max currency to buy all your needs.

```
--update --holoCoins 77777777 --usaChips 100000000 --sand 10000000
```

Warp a current save game for Tower of Suffering to the top.

```
--update --raw --type json --key towerlastPos --value "[ 370.0, 0.0 ]"
```

*Note*: Make sure there is a saved game first. This command bypasses any checks.

## Future

* Provide a release.
* Expand the number of save data elements which are supported.
* Provide GUI support.
