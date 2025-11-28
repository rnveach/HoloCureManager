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
Usage: HoloCureManagerCli update [-h] [--holoCoins=<holoCoins>] [--sand=<sand>]
                                 [--usaChips=<usaChips>] [COMMAND]
Update only portions of a save file.
      [COMMAND]       The COMMAND to display the usage help message for.
  -h, --help          Show usage help for the help command and exit.
      --holoCoins=<holoCoins>
                      Update HoloCoins.
      --sand=<sand>   Update Sand.
      --usaChips=<usaChips>
                      Update UsaChips.
```

Note: At least one item is required to update the file with. Multiple updates can be done at a time.

## Future

* Provide a release.
* Expand the number of save data elements which are supported.
* Provide GUI support.
