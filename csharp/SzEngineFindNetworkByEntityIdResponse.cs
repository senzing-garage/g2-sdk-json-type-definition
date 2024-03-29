// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzEngineFindNetworkByEntityIdResponseJsonConverter))]
    public class SzEngineFindNetworkByEntityIdResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Network Value { get; set; }
    }

    public class SzEngineFindNetworkByEntityIdResponseJsonConverter : JsonConverter<SzEngineFindNetworkByEntityIdResponse>
    {
        public override SzEngineFindNetworkByEntityIdResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzEngineFindNetworkByEntityIdResponse { Value = JsonSerializer.Deserialize<Network>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzEngineFindNetworkByEntityIdResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Network>(writer, value.Value, options);
        }
    }
}
