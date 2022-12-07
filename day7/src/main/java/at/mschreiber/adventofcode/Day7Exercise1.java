package at.mschreiber.adventofcode;

public class Day7Exercise1 {
  
  public static int totalCount = 0;
  public static int freeSpace = 70000000;
  
  public static void main(String[] args) {
    String[] lines = input.split("\r\n");
    Dir root = new Dir(null, "/");
    root.name = "/";
    Dir currentDir = root;
    for (String line : lines) {
      if (line.startsWith("dir")) {
        currentDir.files.add(new Dir(currentDir, line.split(" ")[1]));
      }
      else if (line.equals("$ cd ..")) {
        currentDir = currentDir.parent;
      } else if (line.equals("$ cd /")) {
        currentDir = root;
      } else if (line.startsWith("$ cd")) {
        currentDir = (Dir) currentDir.files.stream().filter(it -> (it instanceof Dir) && it.name.equals(line.split(" ")[2])).findFirst().get();
      } else if (line.startsWith("$")) {
        
      } else {
        currentDir.files.add(new DirFile(line.split(" ")[1], Integer.parseInt(line.split(" ")[0])));
      }
    }

    calcSize(root);
    System.out.println(totalCount);
  }

  public static int calcSize(Dir dir) {
    int size = 0;
    for (FsEntry fsEntry : dir.files) {
      if (fsEntry instanceof Dir) {
        size += calcSize((Dir) fsEntry);
      } else {
        size+= ((DirFile)fsEntry).size;
      }
    }
    dir.size = size;
    if (dir.size <= 100000) {
      totalCount+=dir.size;
    }
    return size;
  }
  
  public static String input = "$ cd /\r\n"
      + "$ ls\r\n"
      + "dir bqm\r\n"
      + "dir ctztn\r\n"
      + "dir dbclg\r\n"
      + "dir fhndmnt\r\n"
      + "dir gczqbh\r\n"
      + "276177 hvbf.lvm\r\n"
      + "dir lnsgbqp\r\n"
      + "dir pblb\r\n"
      + "dir pwfs\r\n"
      + "209719 rtv.cjj\r\n"
      + "192236 vmtnnfv.mdq\r\n"
      + "dir vmvpf\r\n"
      + "dir wjgh\r\n"
      + "dir wjqsq\r\n"
      + "$ cd bqm\r\n"
      + "$ ls\r\n"
      + "133711 vqv\r\n"
      + "263237 wwlv.vgv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ctztn\r\n"
      + "$ ls\r\n"
      + "dir gpgbfzbs\r\n"
      + "dir hfvqpt\r\n"
      + "55466 jshtffs\r\n"
      + "dir rgzfgz\r\n"
      + "115519 wdzh.szq\r\n"
      + "dir wmfvclz\r\n"
      + "221554 zgwwgps.gfn\r\n"
      + "$ cd gpgbfzbs\r\n"
      + "$ ls\r\n"
      + "354710 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd hfvqpt\r\n"
      + "$ ls\r\n"
      + "dir cggfgt\r\n"
      + "dir jshtffs\r\n"
      + "175230 nnn.chs\r\n"
      + "13406 plqjpqss\r\n"
      + "dir pnwcq\r\n"
      + "dir str\r\n"
      + "$ cd cggfgt\r\n"
      + "$ ls\r\n"
      + "109434 fhww\r\n"
      + "dir glnrg\r\n"
      + "dir mptpfvlh\r\n"
      + "305315 nlhfgpr.vnv\r\n"
      + "297519 tlvmh.ghp\r\n"
      + "dir vmvpf\r\n"
      + "$ cd glnrg\r\n"
      + "$ ls\r\n"
      + "345026 qzfpwv\r\n"
      + "196361 rgzfgz\r\n"
      + "$ cd ..\r\n"
      + "$ cd mptpfvlh\r\n"
      + "$ ls\r\n"
      + "dir lsbjp\r\n"
      + "121174 vlbbbgnn\r\n"
      + "$ cd lsbjp\r\n"
      + "$ ls\r\n"
      + "dir jqclpq\r\n"
      + "359939 nlhfgpr\r\n"
      + "dir whp\r\n"
      + "$ cd jqclpq\r\n"
      + "$ ls\r\n"
      + "189319 mnhnclpt.qsv\r\n"
      + "$ cd ..\r\n"
      + "$ cd whp\r\n"
      + "$ ls\r\n"
      + "dir lgdlztb\r\n"
      + "$ cd lgdlztb\r\n"
      + "$ ls\r\n"
      + "94150 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "dir pfzd\r\n"
      + "66706 rgzfgz\r\n"
      + "dir zrc\r\n"
      + "$ cd pfzd\r\n"
      + "$ ls\r\n"
      + "345595 bpjpm\r\n"
      + "dir ljtdcgt\r\n"
      + "dir plltpvgv\r\n"
      + "$ cd ljtdcgt\r\n"
      + "$ ls\r\n"
      + "134178 nlhfgpr\r\n"
      + "$ cd ..\r\n"
      + "$ cd plltpvgv\r\n"
      + "$ ls\r\n"
      + "355576 rqj\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd zrc\r\n"
      + "$ ls\r\n"
      + "45363 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "dir bwbwldd\r\n"
      + "124375 fwvcbcpz.lvr\r\n"
      + "dir jctctjj\r\n"
      + "dir jshtffs\r\n"
      + "dir sngchq\r\n"
      + "$ cd bwbwldd\r\n"
      + "$ ls\r\n"
      + "144330 vthsfg\r\n"
      + "$ cd ..\r\n"
      + "$ cd jctctjj\r\n"
      + "$ ls\r\n"
      + "dir flhrmt\r\n"
      + "dir rgzfgz\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd flhrmt\r\n"
      + "$ ls\r\n"
      + "132008 dgrt\r\n"
      + "263345 nlhfgpr.hss\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "214808 mcqlbzs.gwl\r\n"
      + "120157 nlhfgpr.hcs\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir rgzfgz\r\n"
      + "52978 vlbbbgnn\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "177061 nnc\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "157488 bbsfrg.bbr\r\n"
      + "166412 dhwbvggg\r\n"
      + "$ cd ..\r\n"
      + "$ cd sngchq\r\n"
      + "$ ls\r\n"
      + "dir bvcsvv\r\n"
      + "dir hhd\r\n"
      + "$ cd bvcsvv\r\n"
      + "$ ls\r\n"
      + "dir gbmccf\r\n"
      + "5663 vmtnnfv\r\n"
      + "278760 vqv\r\n"
      + "323147 wjlm.cbw\r\n"
      + "$ cd gbmccf\r\n"
      + "$ ls\r\n"
      + "dir fttnqbwp\r\n"
      + "$ cd fttnqbwp\r\n"
      + "$ ls\r\n"
      + "dir fhs\r\n"
      + "$ cd fhs\r\n"
      + "$ ls\r\n"
      + "137718 rgzfgz\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd hhd\r\n"
      + "$ ls\r\n"
      + "350019 gphghhdh.rrb\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd pnwcq\r\n"
      + "$ ls\r\n"
      + "dir qtqqdd\r\n"
      + "$ cd qtqqdd\r\n"
      + "$ ls\r\n"
      + "62319 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd str\r\n"
      + "$ ls\r\n"
      + "334780 tlvmh.ghp\r\n"
      + "dir vcdcgbtr\r\n"
      + "211478 vvh.tzh\r\n"
      + "dir zlsv\r\n"
      + "$ cd vcdcgbtr\r\n"
      + "$ ls\r\n"
      + "276438 zhh.dsw\r\n"
      + "$ cd ..\r\n"
      + "$ cd zlsv\r\n"
      + "$ ls\r\n"
      + "315890 vmvpf.tcs\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "dir qwzfs\r\n"
      + "$ cd qwzfs\r\n"
      + "$ ls\r\n"
      + "dir lzl\r\n"
      + "$ cd lzl\r\n"
      + "$ ls\r\n"
      + "dir gpgccbc\r\n"
      + "259493 vmvpf.dgz\r\n"
      + "$ cd gpgccbc\r\n"
      + "$ ls\r\n"
      + "124141 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd wmfvclz\r\n"
      + "$ ls\r\n"
      + "25819 fmqtjdfd.dwp\r\n"
      + "253619 qccd.gnd\r\n"
      + "121087 sjsz.rtg\r\n"
      + "350518 tgs\r\n"
      + "dir zmft\r\n"
      + "$ cd zmft\r\n"
      + "$ ls\r\n"
      + "248086 vlbbbgnn\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd dbclg\r\n"
      + "$ ls\r\n"
      + "dir dgm\r\n"
      + "dir rwdfw\r\n"
      + "182454 slctrj\r\n"
      + "103919 tzp.dvf\r\n"
      + "311601 zlbmvfq.qsh\r\n"
      + "$ cd dgm\r\n"
      + "$ ls\r\n"
      + "dir fflb\r\n"
      + "dir jshtffs\r\n"
      + "26424 shzfvbs.jrj\r\n"
      + "$ cd fflb\r\n"
      + "$ ls\r\n"
      + "154495 ngzgfpt\r\n"
      + "$ cd ..\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "11509 fwvcbcpz.lvr\r\n"
      + "169064 hzhbhgjn.dvc\r\n"
      + "38675 jwcnwm.prf\r\n"
      + "dir mjb\r\n"
      + "dir nwwcb\r\n"
      + "300017 qtrqn.qdv\r\n"
      + "dir rfjdh\r\n"
      + "173691 rgzfgz.wgz\r\n"
      + "$ cd mjb\r\n"
      + "$ ls\r\n"
      + "dir rgzfgz\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "192387 ssm\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd nwwcb\r\n"
      + "$ ls\r\n"
      + "312609 ggvwvdw.hhg\r\n"
      + "107482 ppqmjzh\r\n"
      + "204253 vlbbbgnn\r\n"
      + "$ cd ..\r\n"
      + "$ cd rfjdh\r\n"
      + "$ ls\r\n"
      + "305213 smf.jgv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd rwdfw\r\n"
      + "$ ls\r\n"
      + "dir hbsbctsr\r\n"
      + "145955 tqj\r\n"
      + "dir vvthg\r\n"
      + "$ cd hbsbctsr\r\n"
      + "$ ls\r\n"
      + "dir shqdr\r\n"
      + "$ cd shqdr\r\n"
      + "$ ls\r\n"
      + "101441 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vvthg\r\n"
      + "$ ls\r\n"
      + "344816 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd fhndmnt\r\n"
      + "$ ls\r\n"
      + "dir lstcq\r\n"
      + "dir nvlncq\r\n"
      + "dir rgzfgz\r\n"
      + "dir ssqs\r\n"
      + "dir vzpnjpsv\r\n"
      + "$ cd lstcq\r\n"
      + "$ ls\r\n"
      + "24507 jshtffs.nrf\r\n"
      + "34332 lvqdthm.gwh\r\n"
      + "313126 szfqhv.jtv\r\n"
      + "274515 wmwpglh\r\n"
      + "$ cd ..\r\n"
      + "$ cd nvlncq\r\n"
      + "$ ls\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "104013 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "311945 nlhfgpr.fcv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ssqs\r\n"
      + "$ ls\r\n"
      + "104254 vlbbbgnn\r\n"
      + "207441 vmpd.tdt\r\n"
      + "$ cd ..\r\n"
      + "$ cd vzpnjpsv\r\n"
      + "$ ls\r\n"
      + "253593 plfsrlr\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd gczqbh\r\n"
      + "$ ls\r\n"
      + "dir nlhfgpr\r\n"
      + "dir rgzfgz\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "dir bwpd\r\n"
      + "86459 vmvpf.mwh\r\n"
      + "$ cd bwpd\r\n"
      + "$ ls\r\n"
      + "345948 rgzfgz.qnp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "dir rgzfgz\r\n"
      + "dir sdsqqq\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "dir mprdrmmz\r\n"
      + "331389 rbcrg.chs\r\n"
      + "191328 rpvpnprr.smn\r\n"
      + "$ cd mprdrmmz\r\n"
      + "$ ls\r\n"
      + "dir ncljgf\r\n"
      + "$ cd ncljgf\r\n"
      + "$ ls\r\n"
      + "309996 bjwvhw.ltr\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd sdsqqq\r\n"
      + "$ ls\r\n"
      + "95157 qmwcb.wsm\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir gbntbhrj\r\n"
      + "dir nlhfgpr\r\n"
      + "283985 ptl\r\n"
      + "dir tnljzft\r\n"
      + "38026 vlbbbgnn\r\n"
      + "$ cd gbntbhrj\r\n"
      + "$ ls\r\n"
      + "117782 jshtffs.fpb\r\n"
      + "9101 rgzfgz.bdp\r\n"
      + "300155 vmtnnfv.wcq\r\n"
      + "$ cd ..\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "dir cpglmt\r\n"
      + "65206 cwmpnz.czl\r\n"
      + "dir gcrntzb\r\n"
      + "$ cd cpglmt\r\n"
      + "$ ls\r\n"
      + "288805 mghgq.msj\r\n"
      + "$ cd ..\r\n"
      + "$ cd gcrntzb\r\n"
      + "$ ls\r\n"
      + "126442 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd tnljzft\r\n"
      + "$ ls\r\n"
      + "278719 ccwfvtgh\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd lnsgbqp\r\n"
      + "$ ls\r\n"
      + "dir lqltnz\r\n"
      + "dir vmtnnfv\r\n"
      + "69119 vmvpf.rgd\r\n"
      + "$ cd lqltnz\r\n"
      + "$ ls\r\n"
      + "dir vmtnnfv\r\n"
      + "dir whvdf\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "3012 vmtnnfv.zlv\r\n"
      + "$ cd ..\r\n"
      + "$ cd whvdf\r\n"
      + "$ ls\r\n"
      + "dir nlhfgpr\r\n"
      + "115838 rwqbdmfb\r\n"
      + "298358 tlvmh.ghp\r\n"
      + "dir vmtnnfv\r\n"
      + "335379 vmtnnfv.ltj\r\n"
      + "129665 zglmsgf\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "12607 fwvcbcpz.lvr\r\n"
      + "dir lrbrcz\r\n"
      + "dir nvqzmflc\r\n"
      + "3793 tlvmh.ghp\r\n"
      + "39593 vqv\r\n"
      + "$ cd lrbrcz\r\n"
      + "$ ls\r\n"
      + "195996 vmtnnfv.hlb\r\n"
      + "$ cd ..\r\n"
      + "$ cd nvqzmflc\r\n"
      + "$ ls\r\n"
      + "190198 vmvpf\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "359558 rdjqs\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir clwrz\r\n"
      + "362269 nphz.plr\r\n"
      + "dir rqbq\r\n"
      + "188843 tlvmh.ghp\r\n"
      + "dir wsrdwm\r\n"
      + "$ cd clwrz\r\n"
      + "$ ls\r\n"
      + "233770 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd rqbq\r\n"
      + "$ ls\r\n"
      + "183770 jtnlfd\r\n"
      + "71164 lwgqzccd.dgb\r\n"
      + "$ cd ..\r\n"
      + "$ cd wsrdwm\r\n"
      + "$ ls\r\n"
      + "266826 bqg\r\n"
      + "dir nlhfgpr\r\n"
      + "53502 nlhfgpr.slz\r\n"
      + "320422 qzsfvzl.wbb\r\n"
      + "dir vhq\r\n"
      + "dir vmvpf\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "dir ddlplnhp\r\n"
      + "dir nbdj\r\n"
      + "$ cd ddlplnhp\r\n"
      + "$ ls\r\n"
      + "dir czp\r\n"
      + "dir dmchbv\r\n"
      + "dir nlj\r\n"
      + "299460 tlvmh.ghp\r\n"
      + "dir wrqqln\r\n"
      + "$ cd czp\r\n"
      + "$ ls\r\n"
      + "286886 tlvmh.ghp\r\n"
      + "98020 vlln\r\n"
      + "$ cd ..\r\n"
      + "$ cd dmchbv\r\n"
      + "$ ls\r\n"
      + "239186 ppjcgwq\r\n"
      + "$ cd ..\r\n"
      + "$ cd nlj\r\n"
      + "$ ls\r\n"
      + "310042 nsgvvfcw.vfm\r\n"
      + "70206 vlbbbgnn\r\n"
      + "$ cd ..\r\n"
      + "$ cd wrqqln\r\n"
      + "$ ls\r\n"
      + "dir bdprgbp\r\n"
      + "$ cd bdprgbp\r\n"
      + "$ ls\r\n"
      + "42055 hjwrqzf.cqj\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd nbdj\r\n"
      + "$ ls\r\n"
      + "dir cdjd\r\n"
      + "$ cd cdjd\r\n"
      + "$ ls\r\n"
      + "330601 bzhvfzh.ldp\r\n"
      + "14662 hjhdwz.qrt\r\n"
      + "188113 pct\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vhq\r\n"
      + "$ ls\r\n"
      + "348147 qsgjjzn.nft\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "192773 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd pblb\r\n"
      + "$ ls\r\n"
      + "dir jshtffs\r\n"
      + "dir pwgtvhm\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "dir vtthv\r\n"
      + "$ cd vtthv\r\n"
      + "$ ls\r\n"
      + "39542 fwfz.gll\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd pwgtvhm\r\n"
      + "$ ls\r\n"
      + "271449 hvfq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd pwfs\r\n"
      + "$ ls\r\n"
      + "dir dnnzr\r\n"
      + "dir ncjzvsph\r\n"
      + "dir nlhfgpr\r\n"
      + "$ cd dnnzr\r\n"
      + "$ ls\r\n"
      + "337565 vlbbbgnn\r\n"
      + "345668 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ncjzvsph\r\n"
      + "$ ls\r\n"
      + "290438 fdtftjj.sdt\r\n"
      + "170963 tlvmh.ghp\r\n"
      + "56596 vlbbbgnn\r\n"
      + "72923 vmvpf.ldg\r\n"
      + "$ cd ..\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "321213 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "dir gwbt\r\n"
      + "dir vmvpf\r\n"
      + "dir vplm\r\n"
      + "$ cd gwbt\r\n"
      + "$ ls\r\n"
      + "209996 jrzlrp\r\n"
      + "23503 vmvpf.hwn\r\n"
      + "173320 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "299874 hqwppnws\r\n"
      + "177211 pcqdrn.wqd\r\n"
      + "266011 pjllm\r\n"
      + "227969 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd vplm\r\n"
      + "$ ls\r\n"
      + "dir fbl\r\n"
      + "354786 jdb\r\n"
      + "273253 nncwhbq.vzn\r\n"
      + "dir rgzfgz\r\n"
      + "$ cd fbl\r\n"
      + "$ ls\r\n"
      + "38301 vqv\r\n"
      + "256284 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "60018 rdsrl.whb\r\n"
      + "dir rgzfgz\r\n"
      + "dir wgvw\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "dir gmcqfqrn\r\n"
      + "$ cd gmcqfqrn\r\n"
      + "$ ls\r\n"
      + "337129 rgzfgz.pjs\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd wgvw\r\n"
      + "$ ls\r\n"
      + "14727 zdhwsm\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd wjgh\r\n"
      + "$ ls\r\n"
      + "dir ccgddrt\r\n"
      + "dir cqh\r\n"
      + "60305 dtjctmsw.qgp\r\n"
      + "dir hwr\r\n"
      + "dir jshtffs\r\n"
      + "335879 smfjq\r\n"
      + "344915 vlbbbgnn\r\n"
      + "63031 wdzh.szq\r\n"
      + "dir zbmjg\r\n"
      + "$ cd ccgddrt\r\n"
      + "$ ls\r\n"
      + "148368 dpnlbg.fbb\r\n"
      + "dir vmvpf\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "dir ptwrssn\r\n"
      + "340536 tlvmh.ghp\r\n"
      + "$ cd ptwrssn\r\n"
      + "$ ls\r\n"
      + "119875 jshtffs\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd cqh\r\n"
      + "$ ls\r\n"
      + "dir blvcjl\r\n"
      + "158276 fjv\r\n"
      + "279848 fnh.rdf\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd blvcjl\r\n"
      + "$ ls\r\n"
      + "dir cgsznlm\r\n"
      + "47381 gtcv\r\n"
      + "227459 rgzfgz.wvr\r\n"
      + "dir tgcqhcv\r\n"
      + "dir vff\r\n"
      + "dir vmtnnfv\r\n"
      + "dir vmvpf\r\n"
      + "75937 vmvpf.psj\r\n"
      + "29291 wdzh.szq\r\n"
      + "dir zqmsn\r\n"
      + "$ cd cgsznlm\r\n"
      + "$ ls\r\n"
      + "91350 rpmwrtm.dlr\r\n"
      + "$ cd ..\r\n"
      + "$ cd tgcqhcv\r\n"
      + "$ ls\r\n"
      + "dir hnrhdvff\r\n"
      + "81404 jshtffs.msp\r\n"
      + "158082 jshtffs.szt\r\n"
      + "dir nhmqcm\r\n"
      + "dir rvfsl\r\n"
      + "dir smcrnh\r\n"
      + "$ cd hnrhdvff\r\n"
      + "$ ls\r\n"
      + "154674 htwms.nqc\r\n"
      + "dir rslbgns\r\n"
      + "192997 vlbbbgnn\r\n"
      + "dir vmvpf\r\n"
      + "230969 vqv\r\n"
      + "195769 ztfg.mfd\r\n"
      + "$ cd rslbgns\r\n"
      + "$ ls\r\n"
      + "236439 dwbjh.whr\r\n"
      + "dir gzph\r\n"
      + "279480 tlvmh.ghp\r\n"
      + "107447 vqv\r\n"
      + "$ cd gzph\r\n"
      + "$ ls\r\n"
      + "46947 tdnmmqm\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "285442 sftfzz.pzn\r\n"
      + "292269 vmtnnfv.bbc\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd nhmqcm\r\n"
      + "$ ls\r\n"
      + "219245 hwpgpdm.qrf\r\n"
      + "130169 rsmdgwjz.rph\r\n"
      + "$ cd ..\r\n"
      + "$ cd rvfsl\r\n"
      + "$ ls\r\n"
      + "263768 ctprwbl.tjt\r\n"
      + "dir jshtffs\r\n"
      + "dir rgzfgz\r\n"
      + "291351 vpcd.hvf\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "9465 fwvcbcpz.lvr\r\n"
      + "dir htb\r\n"
      + "dir jshtffs\r\n"
      + "202004 nrgq.cwj\r\n"
      + "dir vmvpf\r\n"
      + "$ cd htb\r\n"
      + "$ ls\r\n"
      + "323938 gwhlttb\r\n"
      + "75918 llmlgmqz.zsp\r\n"
      + "dir nvfv\r\n"
      + "117786 qjjv\r\n"
      + "167090 vmvpf.qvd\r\n"
      + "$ cd nvfv\r\n"
      + "$ ls\r\n"
      + "135820 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "240326 fhr.jbf\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "154309 fwvcbcpz.lvr\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "dir jjfdn\r\n"
      + "dir nlhfgpr\r\n"
      + "$ cd jjfdn\r\n"
      + "$ ls\r\n"
      + "46675 vfwhjfl.zrz\r\n"
      + "$ cd ..\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "26537 qwzcnfz\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd smcrnh\r\n"
      + "$ ls\r\n"
      + "331015 vpttwwc.jgr\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vff\r\n"
      + "$ ls\r\n"
      + "68000 ntbfs.znj\r\n"
      + "265866 rgzfgz.lsl\r\n"
      + "53570 vmvpf.ncb\r\n"
      + "74229 vqv\r\n"
      + "96730 zwq.zdb\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir rgzfgz\r\n"
      + "dir zmr\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "7492 fwvcbcpz.lvr\r\n"
      + "dir gjg\r\n"
      + "dir sfrlhmm\r\n"
      + "$ cd gjg\r\n"
      + "$ ls\r\n"
      + "dir dqjfz\r\n"
      + "59560 vqv\r\n"
      + "33788 wdzh.szq\r\n"
      + "$ cd dqjfz\r\n"
      + "$ ls\r\n"
      + "dir zhtbsq\r\n"
      + "$ cd zhtbsq\r\n"
      + "$ ls\r\n"
      + "222414 cgsjvqvd.rsd\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd sfrlhmm\r\n"
      + "$ ls\r\n"
      + "94423 rgzfgz\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd zmr\r\n"
      + "$ ls\r\n"
      + "269611 gvhrsmt.bdt\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir rgzfgz\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "355703 fwvcbcpz.lvr\r\n"
      + "286378 pcf.dss\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmvpf\r\n"
      + "$ ls\r\n"
      + "336533 fwvcbcpz.lvr\r\n"
      + "80609 hsfnp\r\n"
      + "9548 jld.rvt\r\n"
      + "dir jshtffs\r\n"
      + "219383 rjtrbjl.vbc\r\n"
      + "dir vmtnnfv\r\n"
      + "182036 vmvpf\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "dir jshtffs\r\n"
      + "dir rtnwnqcb\r\n"
      + "358722 szfhzcj.tjt\r\n"
      + "167284 tlvmh.ghp\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "68702 blcgmn\r\n"
      + "299911 jjd.pvb\r\n"
      + "243135 wdzh.szq\r\n"
      + "$ cd ..\r\n"
      + "$ cd rtnwnqcb\r\n"
      + "$ ls\r\n"
      + "128787 jmvlgd.bwv\r\n"
      + "268582 tdpqcqfs.nzp\r\n"
      + "348305 vmvpf.bnl\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir nlhfgpr\r\n"
      + "241246 tlvmh.ghp\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "292694 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd zqmsn\r\n"
      + "$ ls\r\n"
      + "244052 mmthhf.wmd\r\n"
      + "144084 psspc.czf\r\n"
      + "dir vflpgd\r\n"
      + "$ cd vflpgd\r\n"
      + "$ ls\r\n"
      + "22881 hsbbcdp.psd\r\n"
      + "dir rgzfgz\r\n"
      + "dir tmz\r\n"
      + "246706 vmvpf\r\n"
      + "$ cd rgzfgz\r\n"
      + "$ ls\r\n"
      + "346162 jshtffs.hqw\r\n"
      + "dir lhmh\r\n"
      + "dir pfwbz\r\n"
      + "87008 tzddth.whp\r\n"
      + "$ cd lhmh\r\n"
      + "$ ls\r\n"
      + "dir nlhfgpr\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "167305 tlvmh.ghp\r\n"
      + "dir vnsdh\r\n"
      + "$ cd vnsdh\r\n"
      + "$ ls\r\n"
      + "22714 tlvmh.ghp\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd pfwbz\r\n"
      + "$ ls\r\n"
      + "163433 bzttjhqz.hpz\r\n"
      + "198604 vlbbbgnn\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd tmz\r\n"
      + "$ ls\r\n"
      + "300571 bmrs\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "dir llwmdf\r\n"
      + "dir pvzdlsgp\r\n"
      + "48025 zvvrwh.dhw\r\n"
      + "$ cd llwmdf\r\n"
      + "$ ls\r\n"
      + "236755 hbfdll\r\n"
      + "$ cd ..\r\n"
      + "$ cd pvzdlsgp\r\n"
      + "$ ls\r\n"
      + "dir drjbqvn\r\n"
      + "102548 fwvcbcpz.lvr\r\n"
      + "300337 gcv.bnn\r\n"
      + "dir grgc\r\n"
      + "27918 mtnvzzc.vlj\r\n"
      + "dir nlhfgpr\r\n"
      + "92639 wdzh.szq\r\n"
      + "152813 wmnpg\r\n"
      + "$ cd drjbqvn\r\n"
      + "$ ls\r\n"
      + "292541 jshtffs.gjg\r\n"
      + "84918 vqv\r\n"
      + "355763 zqsmd\r\n"
      + "$ cd ..\r\n"
      + "$ cd grgc\r\n"
      + "$ ls\r\n"
      + "45875 nlhfgpr.rnf\r\n"
      + "294562 slshp\r\n"
      + "$ cd ..\r\n"
      + "$ cd nlhfgpr\r\n"
      + "$ ls\r\n"
      + "310430 fpglshq\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd hwr\r\n"
      + "$ ls\r\n"
      + "dir jshtffs\r\n"
      + "dir srrgj\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "275253 fwvcbcpz.lvr\r\n"
      + "262142 vlqflmdn.gtd\r\n"
      + "dir zrm\r\n"
      + "$ cd zrm\r\n"
      + "$ ls\r\n"
      + "103078 jshtffs.ncf\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd srrgj\r\n"
      + "$ ls\r\n"
      + "328221 fqdmfshj.ftn\r\n"
      + "107311 lpdrrw\r\n"
      + "214681 ltq.gmq\r\n"
      + "321175 pzd\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd jshtffs\r\n"
      + "$ ls\r\n"
      + "dir ngbb\r\n"
      + "$ cd ngbb\r\n"
      + "$ ls\r\n"
      + "218170 lvmj.sjg\r\n"
      + "123373 nwv\r\n"
      + "326485 rgzfgz.gjd\r\n"
      + "192138 vlbbbgnn\r\n"
      + "dir vmtnnfv\r\n"
      + "179027 vptgrfr\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "206046 vnlsclvh\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd zbmjg\r\n"
      + "$ ls\r\n"
      + "30152 fwvcbcpz.lvr\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd wjqsq\r\n"
      + "$ ls\r\n"
      + "23196 cmvfcwp.nfz\r\n"
      + "dir lnrzw\r\n"
      + "316798 nlhfgpr.spt\r\n"
      + "dir ntrngh\r\n"
      + "284657 tlvmh.ghp\r\n"
      + "50758 vmvpf.msg\r\n"
      + "$ cd lnrzw\r\n"
      + "$ ls\r\n"
      + "dir crc\r\n"
      + "dir ddhnvwqt\r\n"
      + "dir gdhfqlln\r\n"
      + "dir vmtnnfv\r\n"
      + "$ cd crc\r\n"
      + "$ ls\r\n"
      + "296423 vmtnnfv.prq\r\n"
      + "26320 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd ddhnvwqt\r\n"
      + "$ ls\r\n"
      + "173923 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd gdhfqlln\r\n"
      + "$ ls\r\n"
      + "275288 vqv\r\n"
      + "$ cd ..\r\n"
      + "$ cd vmtnnfv\r\n"
      + "$ ls\r\n"
      + "52004 pgtmmtrf.vfc\r\n"
      + "$ cd ..\r\n"
      + "$ cd ..\r\n"
      + "$ cd ntrngh\r\n"
      + "$ ls\r\n"
      + "dir czt\r\n"
      + "185012 vlbbbgnn\r\n"
      + "$ cd czt\r\n"
      + "$ ls\r\n"
      + "355964 cvnslv\r\n"
      + "143166 mwbcbphd.prr\r\n"
      + "40666 rgzfgz";
}
