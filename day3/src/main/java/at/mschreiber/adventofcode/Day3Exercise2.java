package at.mschreiber.adventofcode;

public class Day3Exercise2 {

  public static void main(String args[]) {
    String input = "gfWpjRRQffQGCHHJsGqjsj\r\n"
        + "SclzJZZvmmnPbJtVSqqNBqVCBdSCsd\r\n"
        + "tlbvZJDZtmtPcJmlPnhMFQWWpMRFTfLDRRTWRp\r\n"
        + "HjMPgSWjVrjgbHRRSSMRgjRdpdbGdlcdCvQfcCdlwQJfdf\r\n"
        + "LNDnhtNtLNFFZDtFnhzvdldDflvvDCdlJfldpJ\r\n"
        + "ZFLFZZmFtFtTNTSPRrVPWWMpRP\r\n"
        + "qLBSBLRwmgzqCbzCffDlrfCV\r\n"
        + "TFFFHNWFMFFMpHpGHMTHGNhrldWZCsdZsslZlZfrflDVss\r\n"
        + "PTMcPGntTThHhTGctnMvSwjjvmmqLBmnjqqgCR\r\n"
        + "nClJtMwwntqVVPJcgZqq\r\n"
        + "mjpsDcrcSSFFPZqFBWWgVP\r\n"
        + "vQcjsvhrvvrmhbmNHMNnlHbNMtCtNM\r\n"
        + "bgvvhnTQtjrrrhsDDf\r\n"
        + "pLSMltLzLLSjFrSSjrSJHD\r\n"
        + "zNWRLBdZPllPQtCvttgCqb\r\n"
        + "DRlDrrFTNDNlgzsGTBfcnqhhcnJfcrCSqc\r\n"
        + "MMmmdWtdLmvtldHjMmQfPBqSJWnfCCCqcWSSPJ\r\n"
        + "vjHMjLmjpLtHptQLmHvwTRgNVVpTzZFZgZRlsVTN\r\n"
        + "rzpMpDCGFCFFjRFsRPFRNFPv\r\n"
        + "fWclbHCHtSmfvjnmfsvZ\r\n"
        + "wTcTlSwwtQtWclBQBLGMLMCLVzVLwJGqLd\r\n"
        + "MQSjLNjPPLLSBPjfQhSPHjDVCjDtVVpDHwbwVpbD\r\n"
        + "RcmWzsRrzZrmTszWRqWlmRJscbtHwCbndCtcDVddDpdnVnbt\r\n"
        + "JTsrGGTqmwTlWmTzJzWmhhPLLGgPFgBffSSPhFFM\r\n"
        + "qMMRNZMDDNWLPqfzCgDcGncVDCgG\r\n"
        + "wwBFhwhhBgmcVzhghG\r\n"
        + "tbJbjjtJvwtdtwjpFtlbvtdTLNSMqNqMMgqNHPlZRTNggL\r\n"
        + "qmjMHsZmZSbjbZMjSLFFFFwgsgvFswpwww\r\n"
        + "hRJBhmnhhvFFwhcv\r\n"
        + "llfWDWzrzBNTRfNBrWzzTmZbGTMjPqMmZPjVbSZGSP\r\n"
        + "CRRPLwwcclcGVppQ\r\n"
        + "SHFjDjjHDTfSDNTTHfSHjQVGrpmllQQWltVVVZGp\r\n"
        + "HFlqzDTfqlzwbgPJLwCP\r\n"
        + "WRCNLphpLppSCWVHNfLRzVnQMnBnMddPMQDFQgrhPQFM\r\n"
        + "jTjJqvqjvPVJFJFBJF\r\n"
        + "qTsZbvGqqZlstsmZVljtwqwSHHNWczHSSRcWNSRHzzNfbW\r\n"
        + "glgzDzHjSrVHcVgbrjmNsscNGmNWssGNNtst\r\n"
        + "hHPQLHJpwdLpdHfQQtnZmNMwnZGZWwsFZM\r\n"
        + "QpdhPJRTJfPphJfhCBlVqVvgvVDBbvVqDbHD\r\n"
        + "VtHzjZpjVtHrprgGmjHsGHNdSJFQRcLJqCdQcSqJNpcq\r\n"
        + "bBWfTPwhbfDlMnhffRwQJQNdqJcLFQLSdR\r\n"
        + "bhBhvfMWTnlDnTBfPSmvmjsjmmGtzHtsHm\r\n"
        + "pcRPRPWrSDcJGZSStmwZZS\r\n"
        + "VnLfCfTlfVzfnMMBCqVNZJdtjNtJjhJdGNNbwT\r\n"
        + "BLvqCCMVsnRQsPQgDcZH\r\n"
        + "cQbqqQhDGhlQfQlhQrqGsTNgLgCpRgLTPPPLNbpg\r\n"
        + "wtHVddVFwSHznZwwznCpRBdjppNBNTTdCjRR\r\n"
        + "ZtWFwWtSmvVnwZDrCMGfQlDDJQmD\r\n"
        + "PzPZGCZzrZrlhdjdCqfCsqQdRD\r\n"
        + "cbvZLVVFvbbNSNFHSDnsDQdnfqNQDRngsR\r\n"
        + "FJHSLSFSScJJbWHFmFVFSZmrrzBmhtBwmzBMPMPzPh\r\n"
        + "nlpFcLBgcVcLbssGVBGGrlpGPhJJJJJqPBZPDNMQMJJhJQZZ\r\n"
        + "SSTjHzfHwtZSPVQVQMRQ\r\n"
        + "TzVHwWfTtzwdVzsbFnGgsbdcGrLc\r\n"
        + "FppVBRVZDdLmrDGmmfrQ\r\n"
        + "NtNMPNshJCzznLGJSrqRrRrr\r\n"
        + "tRssthhPlCWhPzsWtzhzCbVVjwTpVwdZZTpwjbdBbwBc\r\n"
        + "TTWblHWScvPCCHTWFzSrqqsNNSmdmqrrpz\r\n"
        + "RLRwjjnjZNprzmmZcq\r\n"
        + "QQgtQnccQDGjgLDRRcLthQhFBvCbMtMHTWlBFllBbFCMTW\r\n"
        + "WnBVNvDnVsNvZWdrWDLVDMbsHpTjpHCSSClsbSCCMH\r\n"
        + "GPFtmztzgPhRFtJTdbTwjppSCjpgSl\r\n"
        + "hJcfPtQhdtWNVZqNnqNQ\r\n"
        + "GLcqZPPsnqQcFsmBBrqRvrddNqrC\r\n"
        + "MtHthJwLllwvjRvvtrvBRS\r\n"
        + "VHMfDLbpfznszZQG\r\n"
        + "WBSdPlQPRfBtGQPfBGPBJgzgjwsJzsszJwCrdwCT\r\n"
        + "ZpppVpMVpnVHMVVbZRJrCgwRzTJrwNJw\r\n"
        + "MvhmnpLqLmhVmBlftRQBFSlR\r\n"
        + "hhQlSJqhtCSnqZJnqShSlNDwRzpvdwRlMBMMdcjRjMpMRc\r\n"
        + "frrGmLmWbfFrsmFHmBzBvBcwdJbvpjzbMM\r\n"
        + "mmgFrVGLWJLFGsgfhSVtVPqntqnnSStN\r\n"
        + "SFJTJTSqswwFQbwf\r\n"
        + "cDtcWPclrtPwVsfssQmN\r\n"
        + "HDtwWCgWdggdzSGJMSzGMq\r\n"
        + "JpqJtWRJMhCMJpMQCWtFrjgHdgdlgllwNjlQjldH\r\n"
        + "fBzPZcZvnBmDnZvZBZDmPvglVVVdgHHSwrNRgVgwNPRH\r\n"
        + "GbZnZccfvcsZmccsmnnZTRbCCMWFTWJqFCCMJFRT\r\n"
        + "vrrFqrFTBTmLmNrLMqMTHddJbHpWnhdWdWbHhJGM\r\n"
        + "wBzfwzcQSzWSSshpdWGp\r\n"
        + "gwjPPPDQtzQlzQDPqTgLBRmRqZBvqFNR\r\n"
        + "bWVptFFsbPcZsGLhsZGmLB\r\n"
        + "qnWrnrHdMCDCNqfWmvRRZSSRLdRGZGRG\r\n"
        + "nNqqNDfMrMWHDQNHzWfHNDnwzblpzFlbwtFbVVlwVcPJpP\r\n"
        + "BHJhlHdJQggvddglJBBhglhQzZHPZpFFPDMzFDDRDFZZDFZD\r\n"
        + "rSTfqnCffMfCVfCLNqbzbjWNDbbWDPFpPFbP\r\n"
        + "nfnnrSfCTVSwrqSLCGfTGlgQhlvsGMJQJBhhssJhGc\r\n"
        + "tBjjDjjqfDjLfJlrLgglvmrlmrcc\r\n"
        + "TwNNTVhwwpgvGSNNSssS\r\n"
        + "TbwhnvvChhbVRTPPRJBJQQfJttMQQJCQfW\r\n"
        + "mWSvSQVgmWQsQvspQJlrlLnJLLpCClhhlp\r\n"
        + "bFHRjZdNjjBZzFzhtnCllCcJLrCBll\r\n"
        + "HFFNHbdZZLZjfPFjHVQmWDDVsvsmTqVqDf\r\n"
        + "JJPllQQClqgBCgdHwHbpjVTwHd\r\n"
        + "tmGZtjGjHZpVbfMT\r\n"
        + "ShGjNGWmDSNcNRtGmshDRzzCvzQJJRBLrvlrBPJv\r\n"
        + "cTpqsTWqVVpsNLfvCDFlMFDVFL\r\n"
        + "JnndJPddQgzHlvMJFDhLCG\r\n"
        + "BjtntgdRnQgzjdBRQBlpNWrTTlNTSwNpWS\r\n"
        + "qHmqLVLjmVqsDBLtmjmbtPwCTwwPzGWRgGwGwMwW\r\n"
        + "ZhcCNCSprRTWTwSnWW\r\n"
        + "hflhZvvQhppZfcNpvrhpQHjVjLmbVmmVHVCFDvqVFb\r\n"
        + "nnNrwDnZrspwDNnZsNSDsNbCmpjvMTPQjLMmPmmQPGBTQP\r\n"
        + "FdVtRdRfctBQPmTtTLQB\r\n"
        + "qhzWVWJqVHwbhlLSsS\r\n"
        + "htWmhDhFztnztDhtBmBtghPRSrpfjVwPdfPwpwnRSVrr\r\n"
        + "cbCHvgJGcTqbqcbqqqcqsMsRVrSCwffdRPPpVpwCRSwfjj\r\n"
        + "GlgGQqTqbgQzttmBNNFz\r\n"
        + "NWQNQgdTgjQNddTZfrCQWRDnnnbqnLqnRcjJlqqvDj\r\n"
        + "FtSSmSmJhpllcclDvpln\r\n"
        + "JBVVSsSFBVBttShFGSPQfCGNdrMfZZTQTZNNdC\r\n"
        + "HgHthMhphcbfbMMfHhsGGDCRRVlcVSScsCRz\r\n"
        + "nWvPFqLqPNdjnNLnjdJnPdWjGlssDPSsllVCRzlTCTGlSDzS\r\n"
        + "RvddJRJQHwQwpZZb\r\n"
        + "gdZwgpjZZQtHTdrWrwdpWRnlhNBRlLbFthNhflhBnL\r\n"
        + "CVzDCPGMVqVmGsGGbJCmCDvMcRcqnBFFFnRBBNRBBNqhnFfF\r\n"
        + "DsmSGsGPzvMGJvdbgTSTbjbSSdgH\r\n"
        + "jBGmbNBQGdBNNDJNQRLLVDsHtDRzHHZZcH\r\n"
        + "wCWPFWPCrPhPrplvprhwpCHHtszttqZslRVHLtzVlJZL\r\n"
        + "vprMMvMnJCwnnPShNGSTfGSfNmmgdNff\r\n"
        + "bPtLbvVWWztbLSVVnbszpzQsrcDDBdpRcDrs\r\n"
        + "llZmgCZqgCFgmdRdJcscBdJsmQ\r\n"
        + "FZlgfqCFfgZHlqCMCglwCFGWntLLSMRSPGPVttWRtVGL\r\n"
        + "vtnDsDtrnrSvrMVmbrrJgPCmBm\r\n"
        + "FpQHzFclLVzWHhwHLQLlHLzPmMBQCJTdTmCTmBTJTTmgQg\r\n"
        + "pllcVWqlffZqZtZD\r\n"
        + "TSSZWpsQmZWcTZSvsTTTppNPzrBPrNBrzQNVFrBBNPqP\r\n"
        + "CgjmCbtGgftMmLtLmffzBzJJJNVVMNzNBqJrFN\r\n"
        + "gjgjLgtLwgbGjHdhhGdvmlnllnpWnplZvcvwTl\r\n"
        + "htLrRFRtbbhlGSLRtbJBJsjBmgMMgJgtmBzz\r\n"
        + "pZQWddQQfpZZffcDQZwddQwDMqDDsPgGJJzzjqzgJMBJgmms\r\n"
        + "QdcQTdwpGNwfrCRlRVlNLSbb\r\n"
        + "wrdvpVBVpMGPPjWjGZJJZT\r\n"
        + "tChCSlNfCCHtvHHWPHPZ\r\n"
        + "RbRRNvmcqcblfMwwdVBQQqqdpL\r\n"
        + "qcctqRcqmcHWzHBdDMZhfwthBnwt\r\n"
        + "JFsSNMSgNSNJJMGJBBdjhFDfhwhBrwnZ\r\n"
        + "TbgbsSgJMTJllblLCSPlsTCVQmRVVWpQzzqpqzVzHLQzcc\r\n"
        + "CVcWbjjSSCSSnpjWpCpprhHZlHtHGzHrZrHGclrl\r\n"
        + "gqZqdddLgmgNqvTGGHvvmrrGHT\r\n"
        + "FFDgZfZNLMgNfdDqDRnsnjBpbSbnMBBWpQpB\r\n"
        + "qwpQFwRnqFFfSBSfFt\r\n"
        + "LJJLGLWWtZlbgWHgGshhSdSVzmhHmfVzzC\r\n"
        + "lrbrbrNNJgDMLLbblGctvvvDqPcqctTTTcqP\r\n"
        + "vnblvbfHvlcHMlHlZbSPLTPLwCMBRRPRRFFR\r\n"
        + "tszzBqtzDsWVPRSmzLVmVL\r\n"
        + "tsNsDDNgGsqBrgBpgdHQbfhflcHdpZvdbh\r\n"
        + "cCpLtpGGLsgsppcpmGGHMtjfHRVhvvVVFRfhjV\r\n"
        + "NWnnnNNndQnQZdCdzzRVMHzvhhHWWWjj\r\n"
        + "CPJJrnSZpGDJLGTL\r\n"
        + "cnJzpcnmnQVFbzTlvTHBlb\r\n"
        + "tWCDPjfsDGfZhddhjjdTvFTgFgvbnFHvdHqT\r\n"
        + "hjfCjwDDGjPthsfhsnGNrJcQcRmJMLVJrJNMLw\r\n"
        + "CPPRrSlRccPcwTHwfdwTHdfl\r\n"
        + "mLQLLjhQhhQLZvpzssHDhdTswzzTJD\r\n"
        + "gmjbBvQLWmgbQZBCSRnnnSMVCBHnBS\r\n"
        + "sWrBJbsVqschzhQzHh\r\n"
        + "gtFmztnSlSfdlmnZSdSwcwGRTjcTcwwTcHccRg\r\n"
        + "FzFDzMZCdDZtCSrJVBMqWVrqNBqN\r\n"
        + "TvWlhhfhZJVgtSSl\r\n"
        + "ddBdGGdFmmBbdzqqPDDGGmdDZSgttHtZppSgzZHSgMhtMgtz\r\n"
        + "PGqdrbbbdPnrcjjhTRWLLc\r\n"
        + "trrmJWcrVwVbcPScdcBdGPHH\r\n"
        + "JTQnfjlJTpQFfMLlNJHHGDPdGsSdDjHGDPPH\r\n"
        + "ffFfnCTTCfTlplTMvNVzqWvwVzrrhwmWhJbW\r\n"
        + "hVtDtgcghzJpmmhlwp\r\n"
        + "srsnrqqsPqsBPvnqRBRMPbnwlplpmCStJwmzJPtJzJfwSw\r\n"
        + "bbrqjBbvGsjGGBWqMVFFVDNVNjZjgtgFgZ\r\n"
        + "mnmhBDHhwWCHsTgRsH\r\n"
        + "dcSlFvccMFMMFFggNsTzzvvzWnVW\r\n"
        + "llQdllZScFplJPpdcZSqBqjhmtnrwrDGnQGhrq\r\n"
        + "ZffVNgfTdmPVltsnnGwgQDnB\r\n"
        + "rMCFLMHpzCMFzHpzbrcHFLzBwsDsDDnlDBJrDDBBSJSnBn\r\n"
        + "MLMjMzqpCzvwqTmwZdvq\r\n"
        + "DDNlWPRqgPRPsRFjJQZbchJZbgQJ\r\n"
        + "zzrLLznpLbHnjcBHvVvHvJcZ\r\n"
        + "ndmrTzbMMTfzrTfnTLrzdpmsPPPqlqGDNNsPCRDRqRsD\r\n"
        + "zzdqTNfTfdfhgQhgqMFSjRDtDRWHqtWlwtqDRS\r\n"
        + "ssBCrcmpVGZvVRDdSDRwtmWdDb\r\n"
        + "rvGPCZLCVCPVBZFdnfThgNgLJNhf\r\n"
        + "bslcrssQwDPbQrrcsbsnQrjMLthPMMRhLRhLRgzmgPhRgM\r\n"
        + "DffvDfHGfNFdpfTdMtghLBThzVmBhBtM\r\n"
        + "SNvJNJdflDDbcDWJ\r\n"
        + "HFlHNpWsTlGWbFsGFTGHFLLNzPPhLVPMzVzMNPhhzP\r\n"
        + "jSvZtmrqqpcrCpPVzw\r\n"
        + "dddQvqDgDmjdSQQdqZjStpffWGgBRWTGfGsRlWBlHF\r\n"
        + "THnTbNrdBnLTHHnTnBrWRTndsccZsLZcDqmLDPcDlQDsmmsZ\r\n"
        + "ptwzzhpvGSVdqQlmszqmqPqc\r\n"
        + "wGVjSddCBggCHFWN\r\n"
        + "LFFbdbhhhvwvfTNdRhhRRvMbHDGjcfcGfDjtDHHcHqGjDqqj\r\n"
        + "WlQnVpWSSWWsPsgDqDzHDLHjJcttGP\r\n"
        + "rrWsZrgVnWrWSlmSlmSBFFbvTThhBFvvZLBhRw\r\n"
        + "BgBdcjThvjFcTggrqvVfzlnnPlrqLt\r\n"
        + "JpwJGPsQwpwSssHpPLlzlnNlzLLNNLVtsN\r\n"
        + "JPMmWGmWPmHbHpJbWGJmDmwbBTRZMBBdZCRTRjFjhCZCCBTT\r\n"
        + "BjbcLFRfBRhnbGjCVVvPllpcPtcDmdlPpvPP\r\n"
        + "WrMQqCNgsqWWsTNCMZMWWsWPvJDJDddvlpDtZDpDDDDwvP\r\n"
        + "qNMzzSzSQsGLbFCSCnVR\r\n"
        + "tTRpHJQpQBZcddhhMhvhJN\r\n"
        + "zswljflgMFbwPqmNmSdvShLNfLhm\r\n"
        + "qFbsMCVgsqMwRWHCWDDBDWpt\r\n"
        + "VSTCCWsJvGpHHCNC\r\n"
        + "GrqzZrrZjDljcDDlfjMqgRPfPvQPpBHNvHvBpvNQ\r\n"
        + "rljncDcznjMqhlhZDnltrzhTsGWtbVLFTTWGsbdWJdFTmL\r\n"
        + "mJPDSJJPZPJNrprSNrDmpZGrhFFhBqjGbGGVbFjhhfqBjBRV\r\n"
        + "cgnTQHdMQdTHdhqfggBhVqVfVS\r\n"
        + "nQdLLddssSJrmsNvZrPz\r\n"
        + "jfjffQzZQQMzZZfZZQFgjDWBCRlCBdTTBGGGRpBCgdhdBG\r\n"
        + "LrstWtNsbHLsprRBdlGpCwlh\r\n"
        + "HLnntbnscqLvvPNNfMWSSmDMDPjzjDzS\r\n"
        + "vhcGwWVvglltcfBn\r\n"
        + "BBSLrzSJLzJNJrLfPfPRsmDRmflD\r\n"
        + "jMjFZJNMqzrzZzFNFjNQqJzbCpBBvWdpvTCWhpVwdvHVCGbG\r\n"
        + "HlrnFmRmtRBQPVBTQHHQ\r\n"
        + "psSLJsLpTTdPdLTv\r\n"
        + "fCGgTgfSSCtRtFFzql\r\n"
        + "pfTpStppcDlWfbpDdzQRsQGJhfffQgJHzN\r\n"
        + "ZFZFZmBFwVwBVmLmLsRLRhHNzRLRNNzJ\r\n"
        + "FnnjwVPmnqqqjBjrTdblldCTpcPJtbTD\r\n"
        + "bdZHdWlrjslMMwGG\r\n"
        + "rDDTRBTqSqmJLBJRBTSJpmMsMMjhwvfMhjjfVGsLshhC\r\n"
        + "BqQFRPFRQBJgzrcZNHFdZt\r\n"
        + "wrDdLlDdPWZPTTrwlZpSsPsHVHsSCHnbzMHM\r\n"
        + "JtNFttNCjFvpppnMpJgSVS\r\n"
        + "NFFqFcCQCvfrZmGdZdmqrW\r\n"
        + "GMNNfJnNddJFJWsv\r\n"
        + "HSDwCmmghLmwmmHDpsvdFpMWpppptSbp\r\n"
        + "zCzBCgzhwmhzLrPnVrMqZBNfGf\r\n"
        + "DrHGtbltbCjjjffPrgsmzmcqsgDczdsmgJ\r\n"
        + "VZLwQLZLLVwLBQZnLVphhLQQqsTNmzJdcNTzzmJNqlNBsszz\r\n"
        + "wZLhVMplpQVRRlpVGPfjCjMGCrbHGWWb\r\n"
        + "BHpFrHHbBNTWWTWNhCPwPLNPjCdjLV\r\n"
        + "zJRRzJvZlcZsSMJdzSDjDtfDCtDtjDjjjj\r\n"
        + "dcJcszQJJGRJzRllMpGHpFTWmrTmBTbWWB\r\n"
        + "qnWWqhDhnjmjCMBlNRrfVfRNCB\r\n"
        + "vvBLBtGHJTHBddrNVJrVSVdr\r\n"
        + "BZLTHbgvHvTFBgTFFvhmWmmZDPmmZDsnqncs\r\n"
        + "WBvmjDbSzTMmHHdpNHNF\r\n"
        + "ttlflZRfGtfWVRltGtflCdHnJrNJHNHnJddNMNCnpF\r\n"
        + "VVwssWQQfRGZcszBQzDbjSBvSBDP\r\n"
        + "lSlQqQVqWWVWfqQWVJSTscdmPPwwTTmjjfpjPp\r\n"
        + "FCbzHbvHvtgrtFCvbvbbwdTwmsrwnTTpmdswmwcc\r\n"
        + "DtZbHdghztlLMQlWWhVQ\r\n"
        + "pqzzFSmdFqbQvlpdDGGrGBWPPBVNQnVttZ\r\n"
        + "cgcjwfBMhHCjjLMCrtcnPcsnsPGVnrVs\r\n"
        + "JgCChjjjBHhRRLLjjhplzvzpSFJvzzlDbSqm\r\n"
        + "mZzVQZMhmrffwfQhWhzmrmpBtRcdbnbcdcMpBbDbncdD\r\n"
        + "jsLTSlTWRBSDpnDn\r\n"
        + "GLTsGWGFsfmJGZVJZm\r\n"
        + "BGWshBGnsFWSLWBLlSSLWRJHnrVPrPcNHCNHctnPPJ\r\n"
        + "QmvQCqqMTZqvgmvTjpZCMgMtrVctPptHtrNVrptbJJbrRP\r\n"
        + "CzjCZfCwDzShDWdF\r\n"
        + "HmQlQHmJnpmptmzt\r\n"
        + "MTqMjMPvTvVvhpdztZnSwzwZqS\r\n"
        + "CcbLLPTMtCCsjHNHQFLRRFlRNN\r\n"
        + "GDFwLLLLSrbdPlFBMFsslFHmZH\r\n"
        + "TnJCgthHpVTfZMQZQmzWnZ\r\n"
        + "hjvtjtghtqJvVjhTgNhJTvdvdDDRbbccrwPdcGwrHS\r\n"
        + "MQQMBPzMGQBPBbDQPMhpnRwsGnRhNrFFpRnF\r\n"
        + "vmgHcmCTTlvvvZvTmqcTfmCRdddFnwdRdnVwFpVfpRnwNw\r\n"
        + "gvmqJTcHclCQJNzjMLWbLj\r\n"
        + "DbqqDDbQFqfNtZSLSq\r\n"
        + "RrdjPdmrpWBdmWRdccfLtNttSDMZBfftLMLf\r\n"
        + "dCcgmgRrWcgcppjCVVVVFHFnDnbJnb\r\n"
        + "fZMFfrtVdZSDVwTgjRMLhwTCLj\r\n"
        + "cNzPBNpclllzHbmTNRhqCRTgjC\r\n"
        + "nhhWJzhGPlQcGvsvfJtSfZfrtt\r\n"
        + "PSzrBWQBBGzBlnSnWtDrqHfNfwVwHcLNjHjwcDNmFH\r\n"
        + "hbRhtRCRpRvsRgVVVcNHNNNCwLwc\r\n"
        + "ZtRTRvttWWzBPlGZ\r\n"
        + "tcLnctNsJrWWNDTN\r\n"
        + "pwPPSjHSHHfzvmSvvvFVVGqGVqGmFqrDWgDr\r\n"
        + "pPSvfPQMzCQCSbhllLnQDhbtQZ\r\n"
        + "DmLffDhpVhjjVwvbwNVFbbNSNH\r\n"
        + "JRPBgMPRHBrMHMHqrBMqWJBSQQNbCvndNrdvCNCFwFrQnv\r\n"
        + "WcqJcPGMGtWRRBtgZjjspGHTLHGHTppm\r\n"
        + "ptJtWJpqRwDZZDVWpbDWqlvvflfMjlfCMjdCCdtslv\r\n"
        + "rLwTBGBzBBQTzmwCCjvdvlLllddsMl\r\n"
        + "NBwTmrGNgrTrcgPpWgWPDSVVPW\r\n"
        + "CdglMnrlSSqDPpcsZb\r\n"
        + "ccwmVJtvVvVtNhBpBFPDVpqbbD\r\n"
        + "TRGQjJjGTmtrTCgHWLfrcn\r\n"
        + "JNNhLwWwWQHNPDmmjHpc\r\n"
        + "zMqZCvVCSMVqMSTVvZVGsBnlslpmsmzlPmsHPsPB\r\n"
        + "qTVqrgdCCbhfHJQFtg\r\n"
        + "wNwCBBCZsfQWfmLCGSmmFRGSSF\r\n"
        + "zjnPHPVqMhhZLTcbpbSncp\r\n"
        + "lVlhlgzlPZlwtgBddJdfvf\r\n"
        + "JWRWRRLWJLnjtjnLzGzznflBvfPvPMqMDqdbzblCzC\r\n"
        + "TTScTVbHmTsVFrmcsgcHFlPMMvlvrDPdlrDDqdldvl\r\n"
        + "bVpcpchgsFZHbhSmSTsHFFjwtZjnjLttntNjLjNLWtjw\r\n"
        + "rffjPJzWzrgPpGWHVNqTtmqFTVRH\r\n"
        + "cswhvlLBvSLsCtbFccmqVFNTbb\r\n"
        + "wwZSCZSnCLsSDGgDmpGnfmmr\r\n"
        + "rTfJTNtjfNljlrWSlzRtNlTqsddwGnsnHHwwhssTsnqw\r\n"
        + "VpbpZZbvPLbZbbBhwqMHhsGMnJdVwV\r\n"
        + "mgQZJDLBJbbbcbgZClCSfWlrCjRjlDCR\r\n"
        + "fSpwcVfzsztcSSWNNMbnMRqTvtTv\r\n"
        + "mJFmGDDDhGhBJHCQddllqTvCllqTRRWNnMbT\r\n"
        + "FdFDGdDDDhhHdZDjhDmpwSPVZszpwZsVgsPRZs";

    String[] lines = input.split("\r\n");
    int score = 0;
    for (int i = 0; i < lines.length; i = i + 3) {
      String f = lines[i];
      String s = lines[i + 1];
      String t = lines[i + 2];
      char founded = 0;
      for (char x : f.toCharArray()) {
        if (s.contains(String.valueOf(x)) && t.contains(String.valueOf(x))) {
          founded = x;
          break;
        }
      }
      score = score + asciiToScore(founded);
    }
    System.out.println(score);
  }
  
  public static int asciiToScore(char asci) {
    int x = (int) asci;
    x = x - 96;
    if (x < 0) {
      x = x + 58;
    }
    return x;
  }

}
