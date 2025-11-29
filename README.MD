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
Usage: HoloCureManagerCli update [-h] [--timeModeUnlocked] [--atkUp=<atkUp>]
                                 [--collabBan=<collabBan>] [--critUp=<critUp>]
                                 [--customize=<customize>]
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
                                 [--marketing=<marketing>]
                                 [--materialFind=<materialFind>]
                                 [--maxHpUp=<maxHpUp>]
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
                                 [--weaponLimit=<weaponLimit>] [COMMAND]
Update only portions of a save file.
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
      --marketing=<marketing>
                            Update Marketing.
      --materialFind=<materialFind>
                            Update Material Find.
      --maxHpUp=<maxHpUp>   Update Max HP Up.
      --moneyGainUp=<moneyGainUp>
                            Update Money Gain Up.
      --pickUpRange=<pickUpRange>
                            Update Pick Up Range.
      --refundAll=<refundAll>
                            Update Refund All.
      --regeneration=<regeneration>
                            Update Regeneration.
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
      --usaChips=<usaChips> Update UsaChips.
      --weaponLimit=<weaponLimit>
                            Update Weapon Limit.
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
  -t, --type=<type>     Supported types are boolean and double.
  -v, --value=<value>
```

Note: This replaces the update command and only 1 update can be made at a time with this method.

Note 2: This command accepts what you provide it at face value. Be careful in using this command. It should only be used if you know what you are doing.

## Future

* Provide a release.
* Expand the number of save data elements which are supported.
* Provide GUI support.
