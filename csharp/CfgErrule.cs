// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgErrule
    {
        [JsonPropertyName("DISQ_ERFRAG_CODE")]
        public string DisqErfragCode { get; set; }

        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        [JsonPropertyName("ERRULE_DESC")]
        public string ErruleDesc { get; set; }

        [JsonPropertyName("ERRULE_ID")]
        public int ErruleId { get; set; }

        [JsonPropertyName("ERRULE_TIER")]
        public int ErruleTier { get; set; }

        [JsonPropertyName("QUAL_ERFRAG_CODE")]
        public string QualErfragCode { get; set; }

        [JsonPropertyName("REF_SCORE")]
        public int RefScore { get; set; }

        [JsonPropertyName("RELATE")]
        public string Relate { get; set; }

        [JsonPropertyName("RESOLVE")]
        public string Resolve { get; set; }

        [JsonPropertyName("RTYPE_ID")]
        public int RtypeId { get; set; }
    }
}
