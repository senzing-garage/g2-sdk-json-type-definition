// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class EngineStatsResponseWorkloadReresolveTriggers
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("abortRetry")]
        public int AbortRetry { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("multipleResolvableCandidates")]
        public int MultipleResolvableCandidates { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("newFeatureFTypes")]
        public AttributeCounters NewFeatureFtypes { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("resolveNewFeatures")]
        public int ResolveNewFeatures { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("unresolveMovement")]
        public int UnresolveMovement { get; set; }
    }
}
