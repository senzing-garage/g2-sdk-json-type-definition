// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class CfgErrule
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DISQ_ERFRAG_CODE")]
        public string DisqErfragCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_DESC")]
        public string ErruleDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_ID")]
        public int ErruleId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_TIER")]
        public int ErruleTier { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("QUAL_ERFRAG_CODE")]
        public string QualErfragCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("REF_SCORE")]
        public int RefScore { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RELATE")]
        public string Relate { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RESOLVE")]
        public string Resolve { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RTYPE_ID")]
        public int RtypeId { get; set; }
    }
}
