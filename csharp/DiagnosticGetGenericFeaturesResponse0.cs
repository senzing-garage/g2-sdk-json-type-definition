// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class DiagnosticGetGenericFeaturesResponse0
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("CANDIDATE_CAP_REACHED")]
        public string CandidateCapReached { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ESTIMATED_COUNT")]
        public int EstimatedCount { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FEAT_DESC")]
        public string FeatDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LIB_FEAT_ID")]
        public int LibFeatId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("SCORING_CAP_REACHED")]
        public string ScoringCapReached { get; set; }
    }
}
