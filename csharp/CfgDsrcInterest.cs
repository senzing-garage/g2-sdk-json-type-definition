// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgDsrcInterest
    {
        [JsonPropertyName("DSRC_ID")]
        public int DsrcId { get; set; }

        [JsonPropertyName("INTEREST_FLAG")]
        public string InterestFlag { get; set; }

        [JsonPropertyName("MAX_DEGREE")]
        public int MaxDegree { get; set; }
    }
}
