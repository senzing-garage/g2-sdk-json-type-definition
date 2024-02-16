// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineFindInterestingEntitiesByEntityIdResponseJsonConverter))]
    public class G2engineFindInterestingEntitiesByEntityIdResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Interesting Value { get; set; }
    }

    public class G2engineFindInterestingEntitiesByEntityIdResponseJsonConverter : JsonConverter<G2engineFindInterestingEntitiesByEntityIdResponse>
    {
        public override G2engineFindInterestingEntitiesByEntityIdResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineFindInterestingEntitiesByEntityIdResponse { Value = JsonSerializer.Deserialize<Interesting>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineFindInterestingEntitiesByEntityIdResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Interesting>(writer, value.Value, options);
        }
    }
}