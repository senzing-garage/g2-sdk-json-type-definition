// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class G2engineStatsResponseWorkloadSystemResourcesCurrResource
    {
        [JsonPropertyName("activeThreads")]
        public int ActiveThreads { get; set; }

        [JsonPropertyName("availableMemory")]
        public string AvailableMemory { get; set; }

        [JsonPropertyName("systemLoad")]
        public IList<G2engineStatsResponseWorkloadSystemResourcesCurrResourceSystemLoad> SystemLoad { get; set; }

        [JsonPropertyName("workerThreads")]
        public int WorkerThreads { get; set; }
    }
}