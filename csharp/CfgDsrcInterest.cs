// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class CfgDsrcInterest
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DSRC_ID")]
        public int DsrcId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INTEREST_FLAG")]
        public string InterestFlag { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MAX_DEGREE")]
        public int MaxDegree { get; set; }
    }
}